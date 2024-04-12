import java.awt.*;
import java.awt.event.*;

public class ListenerExampleAll {
    public static void main(String[] args) {
        Frame frame = new Frame("Listener Example");
        // ItemListener
        Checkbox checkbox = new Checkbox("Check me");
        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checkbox state changed");
            }
        });
        frame.add(checkbox);

        // ContainerListener
        frame.addContainerListener(new ContainerListener() {
            public void componentAdded(ContainerEvent e) {
                System.out.println("Component added to the frame");
            }
            public void componentRemoved(ContainerEvent e) {
                System.out.println("Component removed from the frame");
            }
        });

        // MouseListener
        frame.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        // KeyListener
        frame.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed");
            }
            public void keyReleased(KeyEvent e) {}
        });

        // WindowListener
        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {}
            public void windowClosing(WindowEvent e) {}
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }
            public void windowIconified(WindowEvent e) {}
            public void windowDeiconified(WindowEvent e) {}
            public void windowActivated(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}
        });

        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
