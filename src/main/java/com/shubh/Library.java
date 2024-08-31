package com.shubh;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(String isbn, String title, String author) {
    books.add(new Book(isbn, title, author));
  }

  public List<Book> getBooks() {
    return books;
  }

  public void listBooks() {
    for (Book book : books) {
      System.out.println(
          "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
    }
  }

}
