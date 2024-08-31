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
        User user = new User("111", "Shubh Solanki");
        library.addUser(user);
        assertEquals(true, library.getUsers().contains(user));
        User user2 = new User("112", "Kuldip Gohel");
        library.addUser(user2);
        assertEquals(true, library.getUsers().contains(user2));
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
