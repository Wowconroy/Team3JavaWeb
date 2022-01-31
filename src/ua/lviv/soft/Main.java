package ua.lviv.soft;

import ua.lviv.soft.service.BookService;
import ua.lviv.soft.serviceimpl.BookServiceImpl;

public class Main {
    public static void main(String[] args) {

        BookService bookService = new BookServiceImpl();
        bookService.readAll().forEach(System.out::println);
    }
}
