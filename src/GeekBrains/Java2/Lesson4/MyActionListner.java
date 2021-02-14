package GeekBrains.Java2.Lesson4;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyActionListner implements MouseListener, KeyListener {
    private final JTextArea chatWindow;
    private final JTextField textField;


    public MyActionListner(JTextArea ta, JTextField tf) {
        chatWindow = ta;
        textField = tf;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource().getClass() == JButton.class && !(textField.getText().length() == 0)) {
            sendMessage();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 10 && !(textField.getText().length() == 0)) {
            sendMessage();
        }
    }

    private void sendMessage() {
        chatWindow.setText(chatWindow.getText() + textField.getText() + "\n");
        textField.setText("");
    }
}

