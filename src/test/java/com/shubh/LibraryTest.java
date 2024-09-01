package com.shubh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void bookBorrowTest() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        boolean isBorrowed = library.borrowBook("1224", user1);
        assertEquals(true, isBorrowed);
    }

    @Test
    public void returnFalseIfBookUnavialableToBorrow() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        library.borrowBook("1224", user1);

        // second time borrowing the same book
        boolean result = library.borrowBook("1224", user1);
        assertFalse(result);
    }

    @Test
    public void returnFalseIfBookNotFoundToBorrow() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        boolean result = library.borrowBook("1222", user1);
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
        // First time return
        library.returnBook("1224", user1);
        // Second time return
        boolean result = library.returnBook("1224", user1);

        assertFalse(result);
    }

    @Test
    public void returnFalseIfBookNotFoundToReturn() {
        library.addBook("1224", "It Ends with Us", "Colleen Hoover");

        boolean result = library.returnBook("1222", user1);
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

    @Test
    public void returnFalsePrintBorrowedBooksTest() {
        boolean result = library.printBorrowedBooks();
        assertFalse(result);
    }

    @Test
    public void printAllBooksTest() {
        library.addBook("1224", "It Ends With Us", "Colleen Hoover");
        library.addBook("1225", "It Starts With Us", "Colleen Hoover");
        library.addBook("1111", "Harry Potter and the Philosopher's Stone", "J. K. Rowling");
        library.addBook("1112", "Harry Potter and the Chamber of Secrets", "J. K. Rowling");
        library.addBook("1113", "Harry Potter and the Prisoner of Azkaban", "J. K. Rowling");

        boolean result = library.listBooks();
        assertTrue(result);
    }

    @Test
    public void returnFalseIfNoBookFound() {
        boolean result = library.listBooks();
        assertFalse(result);
    }

    @Test
    public void printAllUserTest() {
        User user2 = new User("112", "Sarang");
        library.addUser(user1);
        library.addUser(user2);

        boolean result = library.listUsers();
        assertTrue(result);
    }

    @Test
    public void returnFalseIfNoUserFound() {
        boolean result = library.listUsers();
        assertFalse(result);
    }
}
