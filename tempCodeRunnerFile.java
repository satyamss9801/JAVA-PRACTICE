import java.awt.*;
import javax.swing.*;

public class FlowLExe extends JFrame {

    public FlowLExe() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        setSize(300, 200); // Set a reasonable size for the frame
        JLabel lb = new JLabel("NAME");
        JButton b1 = new JButton("Button1");
        JCheckBox ck = new JCheckBox("MCA");
        JTextArea tx = new JTextArea(10, 10);
        tx.setText("tEXT AREA");

        add(b1);
        add(lb);
        add(ck);
        add(tx);

        b1.addActionListener(e -> {
            Font currentFont = b1.getFont();
            Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), currentFont.getSize() + 2);
            b1.setFont(newFont);
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLExe();
    }
}
