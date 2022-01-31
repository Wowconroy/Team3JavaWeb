package ua.test.javaone.Two;

import java.util.Scanner;

public class ReaderAdder {
    InsertValueReader insertValue;

    public ReaderAdder(InsertValueReader insertValue) {
        this.insertValue = insertValue;
    }

    Scanner scanner = null;

    public void addHuman(){
        scanner = new Scanner(System.in);
        System.out.println("We'll add your info to DB.");

        System.out.println("Please write your user name");
        insertValue.setUsername(scanner.nextLine());

        System.out.println("Please specify your first name");
        insertValue.setFirstName(scanner.nextLine());

        System.out.println("Please specify your last name");
        insertValue.setLastName(scanner.nextLine());

        scanner.close();
        insertValue.addValueDB();
    }

}
