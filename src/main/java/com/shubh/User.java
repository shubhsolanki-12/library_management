package com.shubh;

public class User {
  String userId;
  String name;

  public User(String userId, String name) {
    this.userId = userId;
    this.name = name;
  }

  public String getUserId() {
    return userId;
  }

  public String getName() {
    return name;
  }
}
