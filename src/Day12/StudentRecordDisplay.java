package Day12;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class StudentRecordDisplay extends JFrame {
    private JTextArea displayArea;
    private JButton fetchButton;

    public StudentRecordDisplay() {
        setTitle("Student Database Records");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        fetchButton = new JButton("Load Student Records");
        fetchButton.addActionListener(e -> loadData());
        add(fetchButton, BorderLayout.SOUTH);
    }

    private void loadData() {
        new Thread(() -> {
            String url = "jdbc:mysql://localhost:3306/your_database";
            String user = "root";
            String password = "password";
            String query = "SELECT * FROM student";

            StringBuilder results = new StringBuilder();
            results.append("ID\tName\tGrade\n");
            results.append("------------------------------------\n");

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {
                    results.append(rs.getInt("id")).append("\t")
                            .append(rs.getString("name")).append("\t")
                            .append(rs.getString("grade")).append("\n");
                }

                SwingUtilities.invokeLater(() -> displayArea.setText(results.toString()));

            } catch (SQLException ex) {
                SwingUtilities.invokeLater(() ->
                        JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage()));
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRecordDisplay().setVisible(true));
    }
}
