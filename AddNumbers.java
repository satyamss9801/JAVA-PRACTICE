import java.awt.*;

public class AddNumbers extends Frame {

    public AddNumbers() {
        // Declare Part
        TextField num1Field = new TextField(10);
        TextField num2Field = new TextField(10);
        TextField resultField = new TextField(10);
        Button addButton = new Button("Add");

        Label num1 = new Label("Number 1:");
        Label num2 = new Label("Number 2:");
        Label resultLabel = new Label("Result:");
        // SET Bounds
        num1.setBounds(20, 50, 70, 20);
        num2.setBounds(20, 80, 70, 20);
        resultLabel.setBounds(20, 110, 70, 20);

        num1Field.setBounds(100, 50, 100, 20);
        num2Field.setBounds(100, 80, 100, 20);
        resultField.setBounds(100, 110, 100, 20);

        addButton.setBounds(100, 140, 50, 20);

        addButton.addActionListener(e -> {
            try {
                int numb1 = Integer.parseInt(num1Field.getText());
                int numb2 = Integer.parseInt(num2Field.getText());
                int sum = numb1 + numb2;
                resultField.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }

        });

        add(num1);
        add(num2);
        add(resultLabel);
        add(num1Field);
        add(num2Field);
        add(resultField);
        add(addButton);

        setLayout(null);
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddNumbers();
    }
}