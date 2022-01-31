package ua.test.javaone.Two;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertValueReader {
    private String username;
    private String firstName;
    private String lastName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addValueDB() {
        Connection connection = null;
        PreparedStatement preparedSt = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        try {
            String query = "INSERT INTO reader (username, first_name, last_name) " +
                    "VALUES (?, ?, ?)";
            preparedSt = connection.prepareStatement(query);

            preparedSt.setString(1, getUsername());
            preparedSt.setString(2, getFirstName());
            preparedSt.setString(3, getLastName());

            preparedSt.executeUpdate();

            System.out.println("Value added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
