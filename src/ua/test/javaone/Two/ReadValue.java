package ua.test.javaone.Two;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadValue {
    public void addInformation() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        try {
            String query = "SELECT * FROM books";
            statement = connection.createStatement();
            resultSet=statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println(resultSet.getString("title") + " -> " +
                        resultSet.getString("author"));
            }

            System.out.println("Reading has been done.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
