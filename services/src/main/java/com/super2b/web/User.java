package com.super2b.web;

public class User {
  private String name;
  private String password;
  private String gender;

  public User(String name, String password, String gender) {
    this.name = name;
    this.password = password;
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getGender() {
    return gender;
  }
}
