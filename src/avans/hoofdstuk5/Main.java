package avans.hoofdstuk5;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100,350);
        frame.setTitle("Hoofdstuk 4");
        frame.setLocation(600,300);
        frame.setContentPane(new Oefening5_13());
        frame.setVisible(true);
    }
}
