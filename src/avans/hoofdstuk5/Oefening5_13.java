package avans.hoofdstuk5;

import javax.swing.*;
import java.util.ArrayList;

public class Oefening5_13 extends JPanel {
    JTextPane textPane;

    Oefening5_13 () {
        textPane = new JTextPane();
        ArrayList<Integer> reeks = berekenFibonnaci();
        String text = "";
        for (int x = 1; x <= 15; x++) {
            text += "|" + reeks.get(x-1) + "|\t|" + reeks.get(x) + "|\n";
        }
        textPane.setText(text);

        add(textPane);
    }

    private ArrayList<Integer> berekenFibonnaci () {
        ArrayList<Integer> reeks = new ArrayList<>();
        reeks.add(1);
        reeks.add(1);
        for (int x = 1; x <= 15; x++) {
            reeks.add(reeks.get(x) + reeks.get(x-1));
        }
        return reeks;
    }

}
