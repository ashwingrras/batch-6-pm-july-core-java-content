package org.example.file_handling.other_examples;

import java.io.Serializable;

public class Student implements Serializable
{
    int id;
    String name;
    int age;

    Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
