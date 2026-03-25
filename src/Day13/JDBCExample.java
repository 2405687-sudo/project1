package Day13;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cse16",
                    "root",
                    "password"
            );

            Statement stmt = con.createStatement();

            String query = "select * from `users`";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            System.out.println("Data fetched successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}