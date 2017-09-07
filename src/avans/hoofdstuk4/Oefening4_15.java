package avans.hoofdstuk4;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening4_15 extends JPanel {
    private JLabel bedragLabel, subLabel, btwLabel, totaalExBtwLabel, totaalBtwLabel, exceptionLabel;
    private JTextField bedrag, sub, btw, totaalExBtw, totaalBtw;
    private JButton totaalKnop, resetKnop;

    private Kassa kassa;

    public Oefening4_15 () {
        setLayout(new GridLayout(5,3, 20, 10));
        Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        kassa = new Kassa();
        exceptionLabel = new JLabel();

        bedragLabel = new JLabel("Voer een bedrag in:");
        bedrag = new JTextField(12);
        bedrag.addActionListener(new InvoerActionHandler());

        subLabel = new JLabel("Subtotaal:");
        sub = new JTextField(12);
        sub.setEditable(false);

        totaalKnop = new JButton("Totaal");
        totaalKnop.addActionListener(new TotaalActionHandler());

        btwLabel = new JLabel("Btw:");
        btw = new JTextField(12);
        btw.setEditable(false);

        totaalExBtwLabel = new JLabel("Totaal ex btw:");
        totaalExBtw = new JTextField(12);
        totaalExBtw.setEditable(false);

        totaalBtwLabel = new JLabel("Totaal");
        totaalBtw = new JTextField(12);
        totaalBtw.setEditable(false);

        resetKnop = new JButton("Reset");
        resetKnop.addActionListener(new ResetActionHandler());

        add(bedragLabel);
        add(bedrag);
        add(exceptionLabel);
        add(subLabel);
        add(sub);
        add(totaalKnop);
        add(btwLabel);
        add(btw);
        add(new JLabel());
        add(totaalExBtwLabel);
        add(totaalExBtw);
        add(new JLabel());
        add(totaalBtwLabel);
        add(totaalBtw);
        add(resetKnop);
    }


    class InvoerActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                kassa.telOp((Double.parseDouble(bedrag.getText())));
            } catch (Exception exception) {
                exceptionLabel.setText("Voer een geldig bedrag in");
                exception.printStackTrace();
            }

            sub.setText(kassa.getSubtotaal()+"");
        }
    }

    class TotaalActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sub.setText(afrondenToString(kassa.getSubtotaal()));
            btw.setText(afrondenToString(kassa.berekenBTW()));
            totaalExBtw.setText(afrondenToString(kassa.berekenSubtotaalExBtw()));
            totaalBtw.setText(afrondenToString(kassa.getSubtotaal()));
        }
    }

    class ResetActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            kassa.reset();
            bedrag.setText("");
            sub.setText(afrondenToString(kassa.getSubtotaal()));
            btw.setText(afrondenToString(kassa.berekenBTW()));
            totaalExBtw.setText(afrondenToString(kassa.berekenSubtotaalExBtw()));
            totaalBtw.setText(afrondenToString(kassa.getSubtotaal() + kassa.berekenBTW()));
        }
    }

    private String afrondenToString (double bedrag) {
        return String.format("%.2f", bedrag);
    }
}
