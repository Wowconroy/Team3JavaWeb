package ua.test.javaone.Two;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InserValueBooks {
    private String title;
    private String author;
    private String info;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void addValueDB() {
        Connection connection = null;
        PreparedStatement preparedSt = null;
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        try {
            String query = "INSERT INTO books (title, author, information) " +
                    "VALUES (?, ?, ?)";
            preparedSt = connection.prepareStatement(query);

            preparedSt.setString(1, getTitle());
            preparedSt.setString(2, getAuthor());
            preparedSt.setString(3, getInfo());

            preparedSt.executeUpdate();

            System.out.println("Value added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
