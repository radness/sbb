package com.example.sbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionTest {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/springbasic";

            conn = DriverManager.getConnection(url, "root", "root");
            System.out.println("connection sussess!");
        } catch (ClassNotFoundException e) {
            System.out.println("fail load driver.");
        } catch (SQLException e) {
            System.out.println("exception: " + e);
        }
        finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
