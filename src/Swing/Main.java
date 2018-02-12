package Swing;

import javax.swing.*;

public class Main {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel();

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setBounds(750,250,500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

    public static void main(String[] args) throws Exception {
        //Window myWindow = new Window("Nikita");
        jFrame.add(jPanel);
        JTextArea jTextArea = new JTextArea(5,20);
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        jPanel.add(jScrollPane);
        jPanel.revalidate();


    }
}
