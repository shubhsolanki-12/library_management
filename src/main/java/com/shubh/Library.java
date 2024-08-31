package com.shubh;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Library {
  private List<Book> books;
  private List<User> users;
  private Map<String, String> borrowedBooks; // Here we will map isbn and userId

  public Library() {
    this.books = new ArrayList<>();
    this.users = new ArrayList<>();
    this.borrowedBooks = new HashMap<>();

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

  public boolean borrowBook(String isbn, User user) {
    for (Book book : books) {
      if (book.getIsbn().equals(isbn) && !borrowedBooks.containsKey(isbn)) {
        borrowedBooks.put(isbn, user.getUserId());
        books.remove(book);
        return true;
      }
    }
    return false;
  }

}
