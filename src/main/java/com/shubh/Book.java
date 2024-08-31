package com.shubh;

public class Book {
  String isbn;
  String title;
  String author;
  boolean isAvailable;

  public Book(String isbn, String title, String author) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.isAvailable = true;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public boolean isAvailable() {
    return isAvailable;
  }
}
