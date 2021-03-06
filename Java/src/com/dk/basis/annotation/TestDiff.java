package com.dk.basis.annotation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 *  To solve {@link AnnotationListenerTest} problem
 *              No use inner class of member variable
 * @author DingKai
 * @version 1.0
 */

@Target(ElementType.FIELD)
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface ActionListenerAnnotation{
    Class<? extends ActionListener> listener();
}

public class TestDiff {
    JFrame jFrame = new JFrame("Test");

    @ActionListenerAnnotation(listener = okListener.class)
    private JButton okButton = new JButton("confirm");

    @ActionListenerAnnotation(listener = cancel.class)
    private JButton cancelButton = new JButton("cancelButton");

    public void init() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        JPanel jPanel = new JPanel();
        jPanel.add(okButton);
        jPanel.add(cancelButton);
        jFrame.add(jPanel);
        ButtonListener.process(this);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        new TestDiff().init();
    }

}

class okListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Confirm button is clicked");
        JOptionPane.showMessageDialog(null,"Confirmed");
    }
}

class cancel implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel button is clicked");
        JOptionPane.showMessageDialog(null,"Cancelled");
    }
}

class ButtonListener{
    public static void process(Object obj) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("com.dk.basis.annotation.TestDiff");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            f.setAccessible(true);
            ActionListenerAnnotation a = f.getAnnotation(ActionListenerAnnotation.class);
            Object jButtonObj = f.get(obj);
            if (a != null && jButtonObj instanceof AbstractButton){
                Class<? extends ActionListener> listener = a.listener();
                ActionListener actionListener = listener.newInstance();
                AbstractButton abstractButton = (AbstractButton) jButtonObj;
                abstractButton.addActionListener(actionListener);
            }
        }
    }
}