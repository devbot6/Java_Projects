import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ToDoApp extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton addButton;
    private JList<String> toDoList;
    private DefaultListModel<String> listModel;

    public ToDoApp() {
        // Set up the window
        setTitle("To-Do List");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the text field and add button
        JPanel inputPanel = new JPanel(new FlowLayout());
        textField = new JTextField(20);
        inputPanel.add(textField);
        addButton = new JButton("Add");
        addButton.addActionListener(this);
        inputPanel.add(addButton);
        add(inputPanel, BorderLayout.NORTH);

        // Create the to-do list
        listModel = new DefaultListModel<String>();
        toDoList = new JList<String>(listModel);
        JScrollPane scrollPane = new JScrollPane(toDoList);
        add(scrollPane, BorderLayout.CENTER);

        // Show the window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String newItem = textField.getText();
            if (!newItem.isEmpty()) {
                listModel.addElement(newItem);
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new ToDoApp();
    }
}
