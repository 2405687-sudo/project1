package Day10;

import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Enter First Number:");
        l1.setBounds(30, 30, 150, 30);
        frame.add(l1);

        JLabel l2 = new JLabel("Enter Second Number:");
        l2.setBounds(30, 70, 150, 30);
        frame.add(l2);

        JLabel l3 = new JLabel("Result:");
        l3.setBounds(30, 110, 150, 30);
        frame.add(l3);

        JTextField t1 = new JTextField();
        t1.setBounds(200, 30, 120, 30);
        frame.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(200, 70, 120, 30);
        frame.add(t2);

        JTextField result = new JTextField();
        result.setBounds(200, 110, 120, 30);
        frame.add(result);

        JButton add = new JButton("Add");
        add.setBounds(30, 160, 80, 30);
        frame.add(add);

        JButton sub = new JButton("Sub");
        sub.setBounds(120, 160, 80, 30);
        frame.add(sub);

        JButton mul = new JButton("Multiply");
        mul.setBounds(210, 160, 100, 30);
        frame.add(mul);

        JButton reset = new JButton("Reset");
        reset.setBounds(140, 200, 80, 30);
        frame.add(reset);

        add.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText(String.valueOf(a + b));
        });

        sub.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText(String.valueOf(a - b));
        });

        mul.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText(String.valueOf(a * b));
        });

        reset.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            result.setText("");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
