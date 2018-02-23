package core.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame {
    private JPanel myPanelTop = new JPanel();
    private JPanel myPanelCenter = new JPanel();
    private JPanel myPanelBottom = new JPanel();
    private JButton connectButton = new JButton("Connect");
    private JButton sendMsg = new JButton("Send");
    private JLabel ipAddrl = new JLabel("IP:");
    private JLabel portl = new JLabel("Port: ");
    private JLabel messagel = new JLabel("Message: ");
    private JTextField ipAddrField = new JTextField(10);
    private JTextField portField = new JTextField(10);
    private JTextField msgField = new JTextField(10);
    private JTextArea chatWindow = new JTextArea();
    private JLabel nicknamel = new JLabel("Nickname: ");
    private JTextField nicknameField = new JTextField(10);
    ButtonEventListener handler = new ButtonEventListener();

    public Window(String value) {

        setLayout(new BorderLayout());

        myPanelTop.setLayout(new GridLayout(2,4));
        myPanelTop.add(ipAddrl);
        myPanelTop.add(ipAddrField);
        myPanelTop.add(portl);
        myPanelTop.add(portField);
        myPanelTop.add(nicknamel);
        myPanelTop.add(nicknameField);
        myPanelTop.add(connectButton);
        add(myPanelTop, BorderLayout.NORTH);

        myPanelCenter.setLayout(new GridLayout(1,1));
        chatWindow.setEditable(false);
        myPanelCenter.add(chatWindow);
        add(myPanelCenter, BorderLayout.CENTER);

        myPanelBottom.setLayout(new FlowLayout());
        myPanelBottom.add(messagel);
        myPanelBottom.add(msgField);
        myPanelBottom.add(sendMsg);
        add(myPanelBottom, BorderLayout.SOUTH);

        connectButton.addActionListener(handler);
        sendMsg.addActionListener(handler);

        this.setTitle(value);
        this.setSize(400,450);
        this.setVisible(true);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == connectButton) {
                portField.setText("sdasd");
            }
            if(e.getSource() == sendMsg) {
                ipAddrField.setText("sdasd");
            }
        }
    }
}
