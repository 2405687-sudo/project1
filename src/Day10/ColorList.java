package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Selector");
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        String colors[] = {"Red", "Green", "Blue", "Yellow"};
        JList<String> list = new JList<>(colors);
        list.setBounds(50, 50, 100, 80);

        JButton btn = new JButton("Change Color");
        btn.setBounds(200, 70, 120, 30);

        panel.add(list);
        panel.add(btn);

        btn.addActionListener(e -> {
            String selected = list.getSelectedValue();
            if (selected.equals("Red"))
                panel.setBackground(Color.RED);
            else if (selected.equals("Green"))
                panel.setBackground(Color.GREEN);
            else if (selected.equals("Blue"))
                panel.setBackground(Color.BLUE);
            else if (selected.equals("Yellow"))
                panel.setBackground(Color.YELLOW);
        });

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}