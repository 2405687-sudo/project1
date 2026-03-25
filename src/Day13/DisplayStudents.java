package Day13;

import java.sql.*;

public class DisplayStudents {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cse16",
                    "root",
                    "password"
            );

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Student Records:");
            System.out.println("----------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " | " + name + " | " + age);
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}