package avans.hoofdstuk6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oefening6_4 extends JPanel {

    private JTextField saldo, invoerBedrag;
    private JLabel saldoLabel, invoerLabel;
    private JButton opnemenButton, stortButton;
    private Bankrekening br;

    private boolean succes;
    private double bedrag;

    public Oefening6_4 () {
        br = new Bankrekening();

        setLayout(new GridLayout(3,2));

        saldo = new JTextField(10);
        saldo.setText(br.getSaldo()+"");
        saldo.setEditable(false);
        saldoLabel = new JLabel("Huidig saldo: ");

        invoerBedrag = new JTextField(10);
        invoerLabel = new JLabel("Voer het te storten/op te nemen bedrag in: ");

        opnemenButton = new JButton("Opnemen");
        opnemenButton.addActionListener(new OpnemenActionHandler());

        stortButton = new JButton("Storten");
        stortButton.addActionListener(new StortenActionHandler());

        add(saldoLabel);
        add(saldo);
        add(invoerLabel);
        add(invoerBedrag);
        add(opnemenButton);
        add(stortButton);
    }

    class OpnemenActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            succes = br.neemOp(stringToDouble(invoerBedrag.getText()));
            if (succes) {
                bedrag = br.getSaldo();
                saldo.setText(bedrag+"");
                clearInvoer();
            }
            setSaldoLabel(succes);
        }
    }

    class StortenActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            bedrag = stringToDouble(invoerBedrag.getText());
            br.stort(bedrag);
            saldo.setText(br.getSaldo()+"");
            setSaldoLabel(true);
            clearInvoer();
        }
    }

    private double stringToDouble (String entry) {
        try {
            invoerLabel.setText("Voer een bedrag in.");
            return Double.parseDouble(entry);
        } catch (Exception exception) {
            invoerLabel.setText("Voer een geldig bedrag in");
        }
        return 0;
    }

    private void setSaldoLabel (boolean succes) {
        if (succes) {
            saldoLabel.setText("Huidig saldo:");
        } else {
            saldoLabel.setText("Onvoldoende op uw rekening.");
        }
    }

    private void clearInvoer () {
        invoerBedrag.setText("");
    }
}
