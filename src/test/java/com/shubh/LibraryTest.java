package com.shubh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void addBookTest() {
        Library library = new Library();
        library.addBook("12345", "Harry Potter and the Philosopher's Stone", "J. K. Rowling");
        assertEquals(1, library.getBooks().size());

        library.addBook("1224", "It Ends with Us", "Colleen Hoover");
        assertEquals(2, library.getBooks().size());

        library.addBook("1234", "It Starts with Us", "Colleen Hoover");
        assertEquals(3, library.getBooks().size());
    }

    @Test
    public void addUserTest() {
        Library library = new Library();
        library.addUser("111", "Shubh Solanki");
        assertEquals(1, library.getUsers().size());
        library.addUser("112", "Kuldip Gohel");
        assertEquals(2, library.getUsers().size());
    }

    @Test
    public void bookBorrowTest() {
        Library library = new Library();
        User user = new User("111", "Shubh Solanki");

        library.addBook("1224", "It Ends with Us", "Colleen Hoover");
        library.addBook("1234", "It Starts with Us", "Colleen Hoover");
        library.addBook("12345", "Harry Potter and the Philosopher's Stone", "J. K. Rowling");

        boolean isBorrowed = library.borrowBook("12345", user);
        assertEquals(true, isBorrowed);
    }
}
