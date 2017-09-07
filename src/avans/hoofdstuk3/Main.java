package avans.hoofdstuk3;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("Hoofdstuk 3");
        frame.setLocation(600,300);
//        frame.setContentPane(new Paneel());
        frame.setContentPane(new Oefening316());
        frame.setVisible(true);
    }
}
