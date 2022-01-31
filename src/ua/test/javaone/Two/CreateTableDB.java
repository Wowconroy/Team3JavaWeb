package ua.test.javaone.Two;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTableDB {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        try {
            String query = "CREATE TABLE books(book_id SERIAL PRIMARY KEY, title VARCHAR(250), author VARCHAR(250))";
            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Done.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
