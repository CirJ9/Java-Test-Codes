import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleJavaGui {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Simple GUI Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Create a label
        JLabel label = new JLabel("Enter your name:");
        panel.add(label);

        // Create a text field
        JTextField textField = new JTextField(15);
        panel.add(textField);

        // Create a button
        JButton button = new JButton("Submit");
        panel.add(button);

        // Create a result label to display the result
        JLabel resultLabel = new JLabel("");
        panel.add(resultLabel);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the text field
                String name = textField.getText();
                // Set the result label text
                resultLabel.setText("Hello, " + name + "!");
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}