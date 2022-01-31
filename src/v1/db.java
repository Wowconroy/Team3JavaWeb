package v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class db {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://45.84.206.101:3306/u417527816_okko_audit", "u417527816_maks", "Library2022");){

                Statement statement = connection.createStatement();

                /*Scanner scanner = new Scanner(System.in);
                System.out.println("Enter category");
                String sCategory = scanner.nextLine();
                System.out.println("Enter name of book");
                String nameBook = scanner.nextLine();
                System.out.println("Enter name of author");
                String sAuthor = scanner.nextLine();
                System.out.println("About...");
                String sCommentary = scanner.nextLine();
                System.out.println("Enter year of book");
                String sYear = scanner.nextLine();
                PreparedStatement preparedSt;
                String query = "INSERT INTO `books_db` (`db_categories`, `db_title`, `db_ author`, `db_comm`, `db_year`) VALUES (`"sCategory"`, `"nameBook"`,"`sAuthor`", "`sCommentary`", "`sYear`""
                        preparedSt = connection.prepareStatement(query);

                 */
                //int add = statement.executeUpdate("INSERT INTO `books_db` (`db_categories`, `db_title`, `db_ author`, `db_comm`, `db_year`) VALUES (`"sCategory"`, `"nameBook"`,"`sAuthor`", "`sCommentary`", "`sYear`")");
                //int add = statement.executeUpdate("INSERT INTO `books_db` (`id`, `db_categories`, `db_title`, `db_ author`, `db_comm`, `db_year`, `db_views`) VALUES ('5', 'Science', 'Einstein', 'John Snow', 'About life Albert Einstein', '1999', '54')");
                ResultSet resultSet = statement.executeQuery("SELECT * FROM `books_db`");
                //.executeQuery(SELECT... для вибору ячейки з бд)
                //.executeUpdate(INSERT INTO...Для добавляння даних в бд/UPDATE... для заміни даних в бд/DELETE... для видалення даних з бд)

                while(resultSet.next()){

                    String id = resultSet.getString(1);
                    String category = resultSet.getString(2);
                    String name = resultSet.getString(3);
                    String author = resultSet.getString(4);
                    String comm = resultSet.getString(5);
                    //.getInt() і тд
                    //System.out.println("Connection successful");

                    System.out.println("Book №" + id);
                    System.out.println("Category: " + category);
                    System.out.println("Name: " + name);
                    System.out.println("Author: " + author);
                    System.out.println("Commentary: " + comm);
                    System.out.println("------------------------");



                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

        }
    }
}
