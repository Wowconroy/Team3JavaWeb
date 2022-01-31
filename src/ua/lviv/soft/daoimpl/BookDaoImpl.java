package ua.lviv.soft.daoimpl;

import ua.lviv.soft.dao.BookDao;
import ua.lviv.soft.domain.Book;
import ua.lviv.soft.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private static String READ_ALL = "SELECT * FROM `books_db`";


    private Connection connection;
    private PreparedStatement preparedStatement;

    public BookDaoImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        connection = ConnectionUtil.openConnection();
    }

    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Book read(Integer t) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public void delete(Integer t) {

    }

    @Override
    public List<Book> readAll() {
        List<Book> listOfBooks = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(READ_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Integer id = resultSet.getInt("id");
                String title = resultSet.getString("db_title");
                String author = resultSet.getString("db_ author");
//                String coAuthor = resultSet.getString("");
                String description = resultSet.getString("db_comm");
                String category = resultSet.getString("db_categories");

//                int rate = resultSet.getInt("");
                int year = resultSet.getInt("db_year");
//                String remaining = resultSet.getString("");
//                int averageTime = resultSet.getInt("");
                int views = resultSet.getInt("db_views");
                listOfBooks.add(new Book(id, title, author, description, category, year, views));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfBooks;
    }
}
