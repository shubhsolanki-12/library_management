package com.shubh;

import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void addBookTest() {
        Library library = new Library();
        library.addBook("12345", "Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997);
    }
}
