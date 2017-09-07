package avans.hoofdstuk4;

import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.setTitle("Hoofdstuk 4");
        frame.setLocation(600,300);
        frame.setContentPane(new Oefening4_15());
        frame.setVisible(true);
    }
}
