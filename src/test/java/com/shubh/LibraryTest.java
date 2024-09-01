package com.shubh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    Library library;
    User user1;

    @BeforeEach
    void setUp() {
        library = new Library();
        user1 = new User("111", "Shubh Solanki");
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
        library.addUser(user1);
        List<User> userss = library.getUsers();
        assertTrue(userss.contains(user1));
    }

    @Test
    public void bookBorrowTest() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        boolean isBorrowed = library.borrowBook("1224", user1);
        assertEquals(true, isBorrowed);
    }

    @Test
    public void returnFalseIfBookUnavialableToBorrow() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        library.borrowBook("1224", user1);
        // second time borrowing same book
        boolean result = library.borrowBook("1224", user1);
        assertFalse(result);
    }

    @Test
    public void returnBookTest() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        library.borrowBook("1224", user1);

        boolean result = library.returnBook("1224", user1);

        assertTrue(result);
    }

    @Test
    public void returnFalseIfBookUnavialableToReturn() {

        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        library.borrowBook("1224", user1);
        library.returnBook("1224", user1);

        boolean result = library.returnBook("1224", user1);

        assertFalse(result);
    }

    @Test
    public void printBorrowedBooksTest() {
        library.addBook("1224", "It Ends With Us", "Colleen Hoover");
        library.borrowBook("1224", user1);
        library.getBorrowedBooks();
        boolean result = library.printBorrowedBooks();
        assertTrue(result);
    }
}
