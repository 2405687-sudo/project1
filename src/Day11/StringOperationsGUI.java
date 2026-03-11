package Day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringOperationsGUI extends JFrame implements ActionListener {
    JTextField inputField, outputField;
    JLabel label1, label2;
    JButton btnCaps, btnSmall, btnConvert, btnWords, btnLetters,
            btnReverse, btnVowels, btnFrequency, btnBeginCaps, btnReset;

    public StringOperationsGUI() {
        setTitle("My Frame");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 180, 180));

        label1 = new JLabel("Enter the string:");
        label1.setBounds(50, 70, 150, 30);
        add(label1);

        inputField = new JTextField();
        inputField.setBounds(250, 70, 300, 25);
        add(inputField);

        label2 = new JLabel("String in result:");
        label2.setBounds(50, 120, 200, 30);
        add(label2);

        outputField = new JTextField();
        outputField.setBounds(250, 120, 300, 25);
        outputField.setEditable(false);
        add(outputField);

        btnCaps = createButton("IN CAPS", 20, 320, 80);
        btnSmall = createButton("IN SMALL", 180, 320, 90);
        btnConvert = createButton("CONVERT CASE", 350, 320, 130);
        btnWords = createButton("WORDS", 560, 320, 90);
        btnLetters = createButton("LETTERS", 730, 320, 100);

        btnReverse = createButton("REVERSE", 90, 345, 95);
        btnVowels = createButton("VOWELS", 260, 345, 95);
        btnFrequency = createButton("FREQUENCY", 460, 345, 115);
        btnBeginCaps = createButton("BEGIN CAPS", 630, 345, 115);

        btnReset = new JButton("RESET");
        btnReset.setBounds(380, 400, 100, 30);
        btnReset.setBackground(Color.BLUE);
        btnReset.setForeground(Color.WHITE);
        btnReset.addActionListener(this);
        add(btnReset);
    }

    private JButton createButton(String text, int x, int y, int width) {
        JButton btn = new JButton(text);
        btn.setBounds(x, y, width, 25);
        btn.setFont(new Font("Arial", Font.PLAIN, 10));
        btn.addActionListener(this);
        add(btn);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = inputField.getText();
        Object source = e.getSource();

        if (source == btnCaps) {
            outputField.setText(str.toUpperCase());
        } else if (source == btnSmall) {
            outputField.setText(str.toLowerCase());
        } else if (source == btnReverse) {
            outputField.setText(new StringBuilder(str).reverse().toString());
        } else if (source == btnWords) {
            String[] words = str.trim().split("\\s+");
            outputField.setText("Word Count: " + (str.isEmpty() ? 0 : words.length));
        } else if (source == btnLetters) {
            outputField.setText("Total Letters: " + str.replaceAll("\\s+", "").length());
        } else if (source == btnVowels) {
            int count = str.replaceAll("(?i)[^aeiou]", "").length();
            outputField.setText("Vowel Count: " + count);
        } else if (source == btnConvert) {
            StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
                else if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
                else sb.append(c);
            }
            outputField.setText(sb.toString());
        } else if (source == btnFrequency) {
            StringBuilder result = new StringBuilder();

            str = str.replaceAll("\\s+", ""); // remove spaces
            str = str.toLowerCase(); // make uniform

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                // Print only first occurrence
                if (result.toString().indexOf(ch + ":") == -1) {
                    result.append(ch).append(":").append(count).append(" ");
                }
            }

            outputField.setText(result.toString());
        } else if (source == btnBeginCaps) {
            String[] words = str.split("\\s+");
            StringBuilder res = new StringBuilder();
            for (String w : words) {
                if (w.length() > 0)
                    res.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
            }
            outputField.setText(res.toString().trim());
        } else if (source == btnReset) {
            inputField.setText("");
            outputField.setText("");
        }
    }

    public static void main(String[] args) {
        new StringOperationsGUI().setVisible(true);
    }
}