import java.awt.*;
import java.awt.event.*;

public class layoutExe extends Frame implements ActionListener {

    CardLayout cardLayout = new CardLayout(40, 30);

    public layoutExe() {
        setTitle("CardLayout Example");
        setSize(400, 300);
        setLayout(cardLayout);
        Button b1 = new Button("Card 1");
        Button b2 = new Button("Card 2");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add("Card1", b1);
        add("Card2", b2);
    }

    public static void main(String[] args) {
        layoutExe f = new layoutExe();
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        cardLayout.next(this);
    }
}
