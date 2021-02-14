package GeekBrains.Java2.Lesson4;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class ClientChatMainWindow extends JFrame {
    public ClientChatMainWindow() {
        setTitle("Chat client window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(0, 0, 800, 600);
        setLayout(new BorderLayout());
        setResizable(false);

        JPanel top = new JPanel();
        JTextArea textArea = new JTextArea(32,70);
        textArea.setEditable(false);
        textArea.setBackground(Color.WHITE);
        JScrollPane jScrollPane = new JScrollPane(textArea);
        top.add(jScrollPane);
        add(top, BorderLayout.NORTH);

        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        JTextField textField = new JTextField("Enter your message here",50);
        JButton button = new JButton("Send");
        bottom.add(textField, BorderLayout.CENTER);
        bottom.add(button, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);

        //adding listner
        MyActionListner actionListner = new MyActionListner(textArea,textField);
        textField.addKeyListener(actionListner);
        button.addMouseListener(actionListner);

        setVisible(true);

    }
}
