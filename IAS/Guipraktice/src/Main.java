import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.concurrent.Flow;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Formular");
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JLabel heading = new JLabel("Formula");
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(1);
        JLabel LivingLabel = new JLabel("Wohnort:");
        JTextField LivingField = new JTextField(1);

        JLabel greetingLabel = new JLabel("");
        JButton Submit = new JButton("Submit");

        JLabel dateLabel = new JLabel("Select a date:");
        JSpinner dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(dateEditor);

        frame.add(BorderLayout.CENTER, panel);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(dateLabel);
        //panel.add(dateSpinner);
        panel.add(dateEditor);
        panel.add(LivingLabel);
        panel.add(LivingField);

        frame.add(BorderLayout.SOUTH, Submit);

        panel.setVisible(true);
        frame.setLocationRelativeTo(null);
        //pheading.setVisible(true);
        frame.setVisible(true);
    }
}