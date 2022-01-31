package ua.test.javaone.Two;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public Connection getConnection() {
        Connection connection = null;
        String db_url = "jdbc:postgresql://localhost:5432/books";
        String username = "postgres";
        String password = "111";

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection(db_url, username, password);
            if (connection != null)
                System.out.println("Get connection");

        } catch (Exception exception) {
            System.out.println("Failure. Missing DB");
        }
        return connection;
    }

}






