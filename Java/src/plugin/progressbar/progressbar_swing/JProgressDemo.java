package plugin.progressbar.progressbar_swing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @author DingKai
 * @Classname JProgressDemo
 * @Description TODO
 * @create 2019/2/18
 */
public class JProgressDemo extends JFrame {
    private static final long serialVersionUID = 1L;

    private JProgressBar processBar;

    public JProgressDemo(){
        /*set The Form Title*/
        setTitle("progressBarUse");

        /*set The Form To Exit The Operation*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*set the form position and size*/
        setBounds(100, 100, 250, 100);

        /*Create a content panel*/
        JPanel contentPane = new JPanel();

        /*Set the initial position at the center of the screen*/
        this.setLocationRelativeTo(null);

        /*Set the content panel border*/
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        /*Application internal panel*/
        setContentPane(contentPane);

        /*Set up streaming layout*/
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        /*Create a progress bar*/
        processBar = new JProgressBar();

        /*Set the string display on the progress bar, false will not display*/
        processBar.setStringPainted(true);

        processBar.setBackground(Color.GRAY);

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    processBar.setValue(i);
                }
                processBar.setString("update completed");
            }
        }.start();

        contentPane.add(processBar);
    }

    public static void main(String[] args) {
        JProgressDemo jpd = new JProgressDemo();
        jpd.setVisible(true);
    }
}
