package com.shubh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    public void addBookTest() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");
        assertEquals(1, library.getBooks().size());

        library.addBook("1234", "It Starts with Us", "Colleen Hoover");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void isBookAvailable() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");
        assertTrue(library.getBooks().get(0).isAvailable());
    }

    @Test
    public void addUserTest() {
        User user = new User("111", "Shubh Solanki");
        library.addUser(user);
        assertEquals(true, library.getUsers().contains(user));
    }

    @Test
    public void bookBorrowTest() {
        User user = new User("111", "Shubh Solanki");
        library.addUser(user);

        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        boolean isBorrowed = library.borrowBook("1224", user);
        assertEquals(true, isBorrowed);
    }

    @Test
    public void returnFalseIfBookUnavialableToBorrow() {
        User user = new User("111", "Shubh Solanki");
        // library.addUser(user);

        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        library.borrowBook("1224", user);
        // second time borrowing same book
        boolean result = library.borrowBook("1224", user);
        assertFalse(result);
    }

    @Test
    public void returnBookTest() {
        User user = new User("111", "Shubh Solanki");

        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        library.borrowBook("1224", user);

        boolean result = library.returnBook("1224", user);

        assertTrue(result);
    }

    @Test
    public void returnFalseIfBookUnavialableToReturn() {
        User user = new User("111", "Shubh Solanki");

        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        library.borrowBook("1224", user);
        library.returnBook("1224", user);

        boolean result = library.returnBook("1224", user);

        assertFalse(result);
    }
}
