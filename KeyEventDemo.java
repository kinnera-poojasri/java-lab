import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {

    Label l;

    KeyEventDemo() {
        l = new Label();
        l.setBounds(50, 100, 300, 50);

        add(l);
        addKeyListener(this);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    // When a key is pressed
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    // When a key is released
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    // When a key is typed
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}