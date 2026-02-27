package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Color Changer");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel red = new JLabel("Red");
        red.setBounds(30, 30, 50, 30);
        frame.add(red);

        JLabel green = new JLabel("Green");
        green.setBounds(30, 70, 50, 30);
        frame.add(green);

        JLabel blue = new JLabel("Blue");
        blue.setBounds(30, 110, 50, 30);
        frame.add(blue);

        Integer values[] = new Integer[256];
        for (int i = 0; i < 256; i++)
            values[i] = i;

        JComboBox<Integer> cbRed = new JComboBox<>(values);
        cbRed.setBounds(100, 30, 80, 30);
        frame.add(cbRed);

        JComboBox<Integer> cbGreen = new JComboBox<>(values);
        cbGreen.setBounds(100, 70, 80, 30);
        frame.add(cbGreen);

        JComboBox<Integer> cbBlue = new JComboBox<>(values);
        cbBlue.setBounds(100, 110, 80, 30);
        frame.add(cbBlue);

        JButton show = new JButton("Show Output");
        show.setBounds(100, 160, 120, 30);
        frame.add(show);

        show.addActionListener(e -> {
            int r = (int) cbRed.getSelectedItem();
            int g = (int) cbGreen.getSelectedItem();
            int b = (int) cbBlue.getSelectedItem();
            frame.getContentPane().setBackground(new Color(r, g, b));
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}