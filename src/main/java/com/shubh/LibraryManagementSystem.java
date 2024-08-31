package com.shubh;

import java.util.Scanner;

public class LibraryManagementSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Library library = new Library();

    // Adding books
    library.addBook("1224", "It Ends with Us", "Colleen Hoover");
    library.addBook("1234", "It Starts with Us", "Colleen Hoover");

    // Adding users
    library.addUser("111", "Shubh Solanki");
    library.addUser("112", "Kuldip Gohel");

    while (true) {
      System.out.println("\nLibrary Management System");
      System.out.println("1. List Books");
      System.out.println("2. List Users");
      System.out.println("3. Borrow Book");
      System.out.println("4. Return Book");
      System.out.println("5. List User's Books");
      System.out.println("6. Exit");
      System.out.print("Enter choice: ");

      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          library.getBooks();
          break;
        case 2:
          library.getUsers();
          break;
        case 6:
          System.out.println("Exiting...");
          sc.close();
          return;
        default:
          System.out.println("Invalid choice, please try again.");
      }
    }
  }
}
