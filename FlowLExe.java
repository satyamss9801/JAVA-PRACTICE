import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;

public class FlowLExe extends Frame {

    public FlowLExe() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(300, 200); // Set a reasonable size for the frame

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Label lb = new Label("NAME");
        Button b1 = new Button("Button1");
        Checkbox ck = new Checkbox("MCA");
        TextArea tx = new TextArea(10, 10);
        tx.setText("tEXT AREA");

        add(b1,"East");
        add(lb,"West");
        add(ck,"North");
        add(tx,"Center");

        b1.addActionListener(e -> {
            Font currentFont = b1.getFont();
            Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), currentFont.getSize() + 2);
            b1.setFont(newFont);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLExe();
    }
}
