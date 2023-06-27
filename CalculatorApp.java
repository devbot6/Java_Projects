import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp extends JFrame implements ActionListener {
    // Create components
    private JButton[] button = new JButton[16];
    private JTextField textField = new JTextField(20);
    private JButton clearButton = new JButton("C");
    private String[] buttonText = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", ".", "0", "=", "/"};

    // Declare variables
    private String operation = "";
    private double firstNumber = 0, secondNumber = 0, result = 0;

    public CalculatorApp() {
        // Set up the JFrame
        super("Calculator App");
        setSize(220, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set up the components
        JPanel panel = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            button[i] = new JButton(buttonText[i]);
            panel.add(button[i]);
            button[i].addActionListener(this);
        }
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // Clear the text field
                textField.setText("");
            }
        });
        panel.add(clearButton);
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        // Make the JFrame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        // Get the button that was clicked
        JButton clickedButton = (JButton) event.getSource();

        // Get the text of the clicked button
        String buttonText = clickedButton.getText();

        // Perform the appropriate operation
        if (buttonText.equals("+")) {
            operation = "+";
            firstNumber = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (buttonText.equals("-")) {
            operation = "-";
            firstNumber = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (buttonText.equals("*")) {
            operation = "*";
            firstNumber = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (buttonText.equals("/")) {
            operation = "/";
            firstNumber = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (buttonText.equals("=")) {
            secondNumber = Double.parseDouble(textField.getText());
            if (operation.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operation.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operation.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operation.equals("/")) {
                result = firstNumber / secondNumber;
            }
            textField.setText(Double.toString(result));
            operation = "";
        } else {
            textField.setText(textField.getText() + buttonText);
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
