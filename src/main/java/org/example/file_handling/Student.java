package org.example.file_handling;

import java.io.Serializable;

public class Student implements Serializable {
    // 101,"Harshit",20
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }


}
