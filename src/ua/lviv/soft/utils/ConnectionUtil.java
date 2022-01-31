package ua.lviv.soft.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static String USER_NAME = "u417527816_maks";
    private static String USER_PASSWORD = "Library2022";
    private static String URL = "jdbc:mysql://45.84.206.101:3306/u417527816_okko_audit";

    public static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);

    }
}
