import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CurrencyConverter extends JFrame implements ActionListener {
    private JTextField t1, t2;
    private JButton b1, b2;
    private JComboBox<String> c1, c2;
    private String[] currency = {"US Dollar", "Indian Rupee", "British Pound", "Euro", "Canadian Dollar", "Emirati Dirham", "Chinese Yuan"};

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setLayout(new GridBagLayout());

        c1 = new JComboBox<>(currency);
        c1.setSelectedIndex(0);
        c2 = new JComboBox<>(currency);
        c2.setSelectedIndex(1);
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Convert");
        b2 = new JButton("Clear");

        JLabel h = new JLabel("Currency Converter");
        JLabel l1 = new JLabel("Select the Input Currency:");
        JLabel l2 = new JLabel("Enter the amount:  ");
        JLabel l3 = new JLabel("Select the Output Currency:");
        JLabel l4 = new JLabel("Converted amount:  ");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weighty = 1.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        add(h, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        add(l1, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(c1, gbc);
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        add(l2, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(t1, gbc);
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        add(l3, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(c2, gbc);
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        add(l4, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(t2, gbc);
        gbc.anchor = GridBagConstraints.CENTER;
        add(b1, gbc);
        gbc.gridwidth = GridBagConstraints.CENTER;
        add(b2, gbc);

        b1.addActionListener(this);
        b2.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        double a, b, c = 0;
        a = Double.valueOf(t1.getText());
        try {
            if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 1) {
                c = a * 60.335456;
            } else if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 2) {
                c = a * 0.595194;
            } else if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 3) {
                c = a * 0.723333;
            } else if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 4) {
                c = a * 1.099742;
            } else if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 5) {
                c = a * 3.672939;
            } else if (c1.getSelectedIndex() == 0 & c2.getSelectedIndex() == 6) {
                c = a * 6.221082;
            } else if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 0) {
                c = a * 0.016574;
            } else if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 2) {
                c = a * 0.009868;
            } else if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 3) {
                c = a * 0.011992;
            } else if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 4) {
                c = a * 0.018234;
            } else if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 5) {
                c = a * 0.060880;
            } else if (c1.getSelectedIndex() == 1 & c2.getSelectedIndex() == 6) {
                c = a * 0.103114;
            } else if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 0) {
                c = a * 1.679949;
            } else if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 1) {
                c = a * 101.251087;
            } else if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 3) {
                c = a * 1.215237;
            } else if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 4) {
                c = a * 1.848254;
            } else if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 5) {
                c = a * 6.170453;
            } else if (c1.getSelectedIndex() == 2 & c2.getSelectedIndex() == 6) {
                c = a * 10.449975;
            } else if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 0) {
                c = a * 1.382656;
            } else if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 1) {
                c = a * 83.332669;
            } else if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 2) {
                c = a * 0.822930;
            } else if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 4) {
                c = a * 1.52083;
            } else if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 5) {
                c = a * 5.078644;
            } else if (c1.getSelectedIndex() == 3 & c2.getSelectedIndex() == 6) {
                c = a * 8.600954;
            } else if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 0) {
                c = a * 0.909156;
            } else if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 1) {
                c = a * 54.794847;
            } else if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 2) {
                c = a * 0.541034;
            } else if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 3) {
                c = a * 0.657569;
            } else if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 5) {
                c = a * 3.339467;
            } else if (c1.getSelectedIndex() == 4 & c2.getSelectedIndex() == 6) {
                c = a * 5.655489;
            } else if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 0) {
                c = a * 0.272260;
            } else if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 1) {
                c = a * 16.409082;
            } else if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 2) {
                c = a * 0.162022;
            } else if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 3) {
                c = a * 0.196942;
            } else if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 4) {
                c = a * 0.299497;
            } else if (c1.getSelectedIndex() == 5 & c2.getSelectedIndex() == 6) {
                c = a * 1.693525;
            } else if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 0) {
                c = a * 0.160762;
            } else if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 1) {
                c = a * 9.689100;
            } else if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 2) {
                c = a * 0.095673;
            } else if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 3) {
                c = a * 0.116292;
            } else if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 4) {
                c = a * 0.176855;
            } else if (c1.getSelectedIndex() == 6 & c2.getSelectedIndex() == 5) {
                c = a * 0.590495;
            }
            t2.setText(String.valueOf(c));
        } catch (Exception x) {
            System.out.println("Error");
        }

        if (ae.getSource() == b2) {
            t1.setText("0000");
            t2.setText("0000");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CurrencyConverter converter = new CurrencyConverter();
            converter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            converter.pack();
            converter.setVisible(true);
        });
    }
}

