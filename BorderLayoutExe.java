import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExe extends Frame {

    public BorderLayoutExe() {
        setTitle("CardLayout Example");
        setSize(400, 300);
        Button b1 = new Button("Card 1");
        Button b2 = new Button("Card 2");

        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.EAST);
        b1.addActionListener(e -> { 
            System.out.println(this);
          });
    }

    public static void main(String[] args) {
        BorderLayoutExe f = new BorderLayoutExe();
        f.setVisible(true);
    }

}