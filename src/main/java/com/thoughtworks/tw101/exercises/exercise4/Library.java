package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        String booksContainingPartialTitle = "";
        for (String bookTitle : books) {
            if (bookTitle.contains(partialBookTitle)) {
                booksContainingPartialTitle += bookTitle + "\n";
            }
        }

        System.setOut(printStream);
        System.out.print(booksContainingPartialTitle);
    }
}
