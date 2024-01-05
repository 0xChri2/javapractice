import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.concurrent.Flow;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Formular");
        JPanel pheading = new JPanel();
        pheading.setLayout(new BoxLayout(pheading, BoxLayout.X_AXIS));
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel heading = new JLabel("Formula");
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(20);
        JLabel greetingLabel = new JLabel("");

        JLabel dateLabel = new JLabel("Select a date:");
        JSpinner dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(dateEditor);

        frame.add(pheading);
        frame.add(panel);
        pheading.add(heading);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(greetingLabel);
        panel.add(dateLabel);
        panel.add(dateSpinner);
        panel.add(dateEditor);

        panel.setVisible(true);
        pheading.setVisible(true);
        frame.setVisible(true);
    }
}