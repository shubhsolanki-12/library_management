package com.shubh;

import java.util.Scanner;

public class LibraryManagementSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Library library = new Library();

    // Adding books
    library.addBook("1224", "It Ends with Us", "Colleen Hoover");
    library.addBook("1234", "It Starts with Us", "Colleen Hoover");
    library.addBook("1111", "Harry Potter and the Philosopher's Stone", "J. K. Rowling");
    library.addBook("1112", "Harry Potter and the Chamber of Secrets", "J. K. Rowling");
    library.addBook("1113", "Harry Potter and the Prisoner of Azkaban", "J. K. Rowling");
    library.addBook("1114", "Harry Potter and the Goblet of Fire", "J. K. Rowling");
    library.addBook("1115", "Harry Potter and the Order of the Phoenix", "J. K. Rowling");
    library.addBook("1116", "Harry Potter and the Half-Blood Prince", "J. K. Rowling");
    library.addBook("1117", "Harry Potter and the Deathly Hallowse", "J. K. Rowling");
    // Creating users
    User user1 = new User("111", "Shubh Solanki");
    library.addUser(user1);
    // User user2 = new User("112", "Sarang");

    while (true) {
      System.out.println("\nLibrary Management System");
      System.out.println("1. List Books");
      System.out.println("2. List Users");
      System.out.println("3. Borrow Book");
      System.out.println("4. Return Book");
      System.out.println("5. List Borrowed Books");
      System.out.println("6. Exit");
      System.out.print("Enter choice: ");

      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          library.listBooks();
          break;
        case 2:
          library.listUsers();
          break;
        case 3:
          System.out.println("Enter book isbn to borrow:");
          String isbn = sc.nextLine();
          library.borrowBook(isbn, user1);
          break;
        case 5:
          library.printBorrowedBooks();
          break;
        case 6:
          System.out.println("Exiting...");
          sc.close();
          return;
        default:
          System.out.println("Invalid choice, please try again.");
      }
      System.gc();
    }
  }
}
