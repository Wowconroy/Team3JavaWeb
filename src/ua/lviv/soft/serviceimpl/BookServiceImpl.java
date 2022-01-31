package ua.lviv.soft.serviceimpl;

import ua.lviv.soft.dao.BookDao;
import ua.lviv.soft.daoimpl.BookDaoImpl;
import ua.lviv.soft.domain.Book;
import ua.lviv.soft.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private static BookService bookServiceImpl;

    public BookServiceImpl(){
        try{
            bookDao = new BookDaoImpl();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static BookService getBookService(){
        if (bookServiceImpl==null){
            bookServiceImpl = new BookServiceImpl();
        }
        return bookServiceImpl;
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
        return bookDao.readAll();
    }
}
