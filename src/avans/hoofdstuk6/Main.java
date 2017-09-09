package avans.hoofdstuk6;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("Hoofdstuk 6");
        frame.setLocation(600,300);
        frame.setContentPane(new Oefening6_8());
        frame.setVisible(true);
    }
}
