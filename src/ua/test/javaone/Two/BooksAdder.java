package ua.test.javaone.Two;

import java.util.Scanner;

public class BooksAdder {
    InserValueBooks inserValueBooks;

    public BooksAdder(InserValueBooks inserValueBooks) {
        this.inserValueBooks = inserValueBooks;
    }

    Scanner scanner = null;

    public void addBook(){
        scanner = new Scanner(System.in);

        System.out.println("We'll add book to DB");

        System.out.println("Specify TITLE");
        inserValueBooks.setTitle(scanner.nextLine());

        System.out.println("Specify AUTHOR");
        inserValueBooks.setAuthor(scanner.nextLine());

        System.out.println("Specify some additional information");
        inserValueBooks.setInfo(scanner.nextLine());

        scanner.close();

        inserValueBooks.addValueDB();
    }
}
