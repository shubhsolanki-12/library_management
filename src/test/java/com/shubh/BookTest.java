package com.shubh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {
  Library library;
  User user1;
  Book book;

  @BeforeEach
  void setUp() {
    library = new Library();
    user1 = new User("111", "Shubh Solanki");
  }

  @Test
  public void addBookTest() {
    book = new Book("1224", "It Ends with Us", "Colleen Hoover");
    assertEquals("1224", book.getIsbn());
    assertEquals("It Ends with Us", book.getTitle());
    assertEquals("Colleen Hoover", book.getAuthor());
    assertTrue(book.isAvailable);
  }

  @Test
  public void addBookTest2() {
    library.addBook("1224", "It Ends with Us", "Colleen Hoover");
    assertEquals(1, library.getBooks().size());
  }

  @Test
  public void isBookAvailableTesst() {
    library.addBook("1224", "It Ends with Us", "Colleen Hoover");
    assertTrue(library.getBooks().get(0).isAvailable());
  }
}
