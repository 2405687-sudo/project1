package Day10;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 500);
        frame.setLayout(null);

        JLabel title = new JLabel("Registration Form");
        title.setBounds(120, 10, 200, 30);
        frame.add(title);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 60, 100, 30);
        frame.add(nameLabel);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 100, 100, 30);
        frame.add(addressLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 60, 150, 30);
        frame.add(nameField);


        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 100, 150, 60);
        frame.add(addressArea);

        JCheckBox java = new JCheckBox("Java");
        java.setBounds(50, 180, 100, 30);
        frame.add(java);

        JCheckBox python = new JCheckBox("Python");
        python.setBounds(150, 180, 100, 30);
        frame.add(python);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(50, 220, 100, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(150, 220, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        frame.add(male);
        frame.add(female);

        JButton submit = new JButton("Submit");
        submit.setBounds(120, 270, 100, 30);
        frame.add(submit);

        ImageIcon icon = new ImageIcon("image.png"); // place image in project folder
        JLabel imgLabel = new JLabel(icon);
        imgLabel.setBounds(120, 320, 100, 100);
        frame.add(imgLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
