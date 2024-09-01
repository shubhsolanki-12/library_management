package com.shubh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
  Library library;
  User user1;

  @BeforeEach
  void setUp() {
    library = new Library();
    user1 = new User("111", "Shubh Solanki");
  }

  @Test
  public void addUserTest() {
    User user = new User("112", "Sarang");
    assertEquals("112", user.getUserId());
    assertEquals("Sarang", user.getName());
  }

  @Test
  public void addUserTest2() {
    library.addUser(user1);
    List<User> userss = library.getUsers();
    assertTrue(userss.contains(user1));
  }
}
