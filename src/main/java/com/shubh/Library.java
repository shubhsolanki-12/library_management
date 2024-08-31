package com.shubh;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Book> books;
  private List<User> users;

  public Library() {
    this.books = new ArrayList<>();
    this.users = new ArrayList<>();

  }

  public void addBook(String isbn, String title, String author) {
    books.add(new Book(isbn, title, author));
  }

  public void addUser(String userId, String name) {
    users.add(new User(userId, name));
  }

  public List<Book> getBooks() {
    for (Book book : books) {
      System.out.println(
          "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
    }
    return books;
  }

  public List<User> getUsers() {
    for (User user : users) {
      System.out.println(
          "UserID: " + user.getUserId() + ", UserName: " + user.getName());
    }
    return users;
  }

}
