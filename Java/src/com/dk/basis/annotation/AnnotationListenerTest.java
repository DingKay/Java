package com.dk.basis.annotation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author DingKai
 * @Classname AnnotationListenerTest
 * @Description                 **** This Java Program Was Wrong ****
 *              The Problem is here : ButtonListener's xx lines ActionListener al = listenerClazz.newInstance();
 *              Because this program is internal_class Class, Before newInstance() U need had out Class's
 *              Instance.
 *              temporarily unable to solve.
 *              //TO DO how to solve
 *              Create a new class {@link TestDiff}
 *              ===========================
 *              2019.01.23 :
 *              Successfully solve the problem !!
 * @create 2019/1/22
 */
public class AnnotationListenerTest {
    @Target(ElementType.FIELD)
    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @interface ActionListenerAnno {
        Class<? extends ActionListener> listener();
    }

    class okListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Confirm button is clicked");
            JOptionPane.showMessageDialog(null, "confirmed");
        }
    }

    class cancel implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Cancel button is clicked");
            JOptionPane.showMessageDialog(null, "cancelled");
        }
    }

    public static class ListenerTest {
        JFrame jFrame = new JFrame("Test");

        @ActionListenerAnno(listener = okListener.class)
        private JButton ok = new JButton("confirm");

        @ActionListenerAnno(listener = cancel.class)
        private JButton cancel = new JButton("cancel");

        public void init() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            JPanel jPanel = new JPanel();
            jPanel.add(ok);
            jPanel.add(cancel);
            jFrame.add(jPanel);
            ButtonListener.process(this);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.pack();
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
        }

        public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
            new ListenerTest().init();
        }

        static class ButtonListener {
            public static void process(Object obj) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
                /* Modify 1:
                * Getting class's Class Object at first*/
                Class<AnnotationListenerTest> aclazz = AnnotationListenerTest.class;
                /* Modify 2:
                * Create an Instance*/
                AnnotationListenerTest annotationListenerTest = aclazz.newInstance();

                Class clazz = obj.getClass();
                Field[] declaredFields = clazz.getDeclaredFields();
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    ActionListenerAnno annotation = field.getAnnotation(ActionListenerAnno.class);
                    Object jButtonObj = field.get(obj);
                    if (annotation !=null && jButtonObj instanceof AbstractButton){
                        Class<? extends ActionListener> listener = annotation.listener();
                        /* Modify 3:
                        * Get DeclaredConstructor and the parameter is aclazz*/
                        Constructor<? extends ActionListener> declaredConstructor = listener.getDeclaredConstructor(aclazz);
                        /* Modify 4:
                        * newInstance Use Constructor*/
                        ActionListener al1 = declaredConstructor.newInstance(annotationListenerTest);

                        ((AbstractButton) jButtonObj).addActionListener(al1);
                    }
                }
            }
        }
    }
}
