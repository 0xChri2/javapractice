import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CombinedListenerExample extends JFrame {

    public CombinedListenerExample() {
        JButton button = new JButton("Klick mich");

        // ActionListener mit Lambda-Ausdruck
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button wurde mit ActionListener geklickt!");
        });

        // MouseListener mit Lambda-Ausdruck
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited");
            }
        });

        // JFrame-Konfiguration
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new java.awt.FlowLayout());

        // Schaltfläche zum JFrame hinzufügen
        add(button);

        // JFrame sichtbar machen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CombinedListenerExample());
    }
}
