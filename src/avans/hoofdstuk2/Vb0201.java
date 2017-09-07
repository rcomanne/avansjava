package avans.hoofdstuk2;

import javax.swing.*;

public class Vb0201 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new Vb0201();
        frame.setTitle("Vb0201");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocation(400,200);

        JPanel panel = new Paneel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
