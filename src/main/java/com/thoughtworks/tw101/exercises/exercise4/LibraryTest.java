package com.thoughtworks.tw101.exercises.exercise4;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LibraryTest {

    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Test
    public void printBooksContaining() {
        String[] books = {
                "Cats Are Great",
                "All Dogs Are Good Dogs",
                "Elephants Are Pretty Neat"
        };

        PrintStream printStream = new PrintStream(outStream);

        Library library = new Library(books, printStream);
        library.printBooksContaining("Are");

        assertEquals("Cats Are Great\nAll Dogs Are Good Dogs\nElephants Are Pretty Neat\n", outStream.toString());
    }
}