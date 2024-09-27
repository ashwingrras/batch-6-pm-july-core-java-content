package org.example.oops.modal;

public class User
{
    public String name;
    public String emailId;
    public int age;

    // this is a keyword, it will represent class reference

    // User() : default constructor , un parameterized constructor
    // User(String name, String emailId, int age) : parameterized constructor
    public User(String name, String emailId, int age)
    {
        this.name = name;
        this.emailId = emailId;
        this.age = age;
    }

    // copy constructor
    public User(User user)
    {
        this.name = user.name;
        this.emailId = user.emailId;
        this.age = user.age;
    }

    public void printUserDetails()
    {
        System.out.println("inside at printUserDetails");
        System.out.println("name = "+name);
        System.out.println("age = "+age);
    }



}
