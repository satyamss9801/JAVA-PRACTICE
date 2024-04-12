import java.awt.*;
import java.awt.event.*;

class MyWindowListener extends WindowAdapter {
    public void windowOpened(WindowEvent we) {
        System.out.println("Window opened");
    }

    public void windowClosing(WindowEvent we) {
        System.out.println("Window closing");
        System.exit(0);
    }
}

public class MyWindowListenerExe extends Frame {
    MyWindowListenerExe() {
        setVisible(true);
        setSize(300, 300);
        addWindowListener(new MyWindowListener());
    }

    public static void main(String[] args) {
        MyWindowListenerExe mf = new MyWindowListenerExe();
    }
 
}
