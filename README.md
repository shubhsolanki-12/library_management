# Library Management System

A simple Library Management System that allows user to perform basic operation such as adding books, borrowing books, returning books, and viewing available books.
The project follows Test-Driven Development(TDD) practices, focusing on writing clean, maintainable code.

## Table of Contents

- [Objective](#objective)
- [Requirements](#requirements)
- [Instructions](#instructions)
- [Setup Instructions](#setup-instructions)
  - [Prerequisites](#prerequisites)
  - [Steps to setup project on your device](#steps-to-setup-project-on-your-device)

## Objective

Create a simple library management system that allows users to perform basic operations such as adding books, borrowing books, returning books, and viewing available books.

## Requirements

- **Add Books**:

  - Users should be able to add new books to the library.
  - Each book should have a unique identifier (e.g., ISBN), title, author, and publication year.

- **Borrow Books**:

  - Users should be able to borrow a book from the library.
  - The system should ensure that the book is available before allowing it to be borrowed.
  - If the book is not available, the system should raise an appropriate error.

- **Return Books**:

  - Users should be able to return a borrowed book.
  - The system should update the availability of the book accordingly.

- **View Available Books**:
  - Users should be able to view a list of all available books in the library.

## Instructions

- **Code Only**:

  - This is a code-only kata. Focus on writing clean, maintainable code and implementing the required features. Do not spend time creating any user interface.

- **Test-Driven Development (TDD)**:

  - Write tests before implementing the functionality. Follow the three laws of TDD
  - Ensure that all tests pass before considering the implementation complete.
  - Aim for high test coverage and meaningful test cases.
  - Clean Coding Practices:
  - Write clean, readable, and maintainable code.
  - Follow SOLID principles and other best practices in software design.
  - Ensure the code is well-documented with meaningful comments and clear variable/method names.

- **Clean Coding Practices**:

  - Write clean, readable, and maintainable code.
  - Follow SOLID principles and other best practices in software design.
  - Ensure the code is well-documented with meaningful comments and clear variable/method names.

- **Git Usage**:
  - Use Git for version control.
  - Create a Git repository for your project.
  - Commit your changes frequently with meaningful commit messages to show your TDD journey.
  - Push your code to a remote repository (e.g., GitHub, GitLab, Bitbucket) and share the repository link.

## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK)**: Ensure JDK is installed on your machine.
- **Maven**: Ensure Maven is installed on your machine.

### Steps to setup project on your device

1. Open your terminal.
2. Run the following command to clone the repository:

   ```bash
   git clone https://github.com/shubhsolanki-12/library_management_system
   ```

3. Navigate into the project directory:

   ```bash
   cd library_management_system
   ```

4. Launch your preferred IDE on your machine.

   - Navigate to the directory where you cloned the project.
   - Open the root folder of the project (e.g., `library_system`).

5. **Build the Project:**
   - Once the project is imported, open terminal of the IDE and run the following command.
   ```bash
   mvn clean install
   ```
6. **Run Test**
   - Navigate to `src/test` directory in the project.
   - Right-click on the `test` directory and select `Run Tests` to run all the test cases.

Thank you
