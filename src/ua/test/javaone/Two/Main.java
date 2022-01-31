package ua.test.javaone.Two;

public class Main {
    public static void main(String[] args) {
        InsertValueReader insertValue = new InsertValueReader();
        ReaderAdder readerAdder = new ReaderAdder(insertValue);

        InserValueBooks inserValueBooks = new InserValueBooks();
        BooksAdder booksAdder = new BooksAdder(inserValueBooks);
        booksAdder.addBook();
    }
}
