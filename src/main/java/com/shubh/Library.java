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

  public void addUser(User user) {
    if (!users.contains(user)) {
      users.add(user);
    }
  }

  public List<Book> getBooks() {
    return books;
  }

  public List<User> getUsers() {
    return users;
  }

  public void listBooks() {
    for (Book book : books) {
      System.out.println(
          "Isbn:" + book.getIsbn() +
              " Title: " + book.getTitle() +
              ", Author: " + book.getAuthor() +
              ", Available: " + book.isAvailable());
    }
  }

  public void listUsers() {
    if (users.isEmpty()) {
      System.out.println("No user found!");
    } else {
      for (User user : users) {
        System.out.println(
            "UserID: " + user.getUserId() +
                ", UserName: " + user.getName());
      }
    }
  }

  public boolean borrowBook(String isbn, User user) {
    if (!users.contains(user)) {
      users.add(user);
    }
    for (Book book : books) {
      if (book.getIsbn().equals(isbn) && book.isAvailable()) {
        book.isAvailable = false;
        borrowedBooks.put(isbn, user.getUserId());
        System.out.println("User " + user.getName() + " borrowed book: \"" + book.getTitle() + "\"");
        return true;
      } else if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
        System.out.println("\"" + book.getTitle() + "\" is not available because someone has already borrowed.");
        return false;
      }
    }
    System.out.println("Book Not Found!");
    return false;
  }

  public boolean returnBook(String isbn, User user) {
    if (!users.contains(user)) {
      users.add(user);
    }
    if (borrowedBooks.containsKey(isbn) && borrowedBooks.get(isbn).equals(user.getUserId())) {
      borrowedBooks.remove(isbn);
      for (Book book : books) {
        if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
          System.out.println("User " + user.getName() + " returned book: \"" + book.getTitle() + "\"");
          book.isAvailable = true;
          break;
        } else if (book.getIsbn().equals(isbn) && book.isAvailable()) {
          System.out.println("Book is already returned.");
          return false;
        }
      }
      return true;
    }
    return false;
  }

  public Map<String, String> getBorrowedBooks() {
    return borrowedBooks;
  }

  public boolean printBorrowedBooks() {
    if (borrowedBooks.isEmpty()) {
      System.out.println("No books are currently borrowed.");
      return false;
    } else {
      System.out.println("Borrowed books:");
      for (Map.Entry<String, String> entry : borrowedBooks.entrySet()) {
        System.out.println("Book ISBN: " + entry.getKey() + ", Borrowed by User ID: " + entry.getValue());
      }
    }
    return true;
  }
}
