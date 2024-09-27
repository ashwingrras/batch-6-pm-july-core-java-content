package org.example.oops.constructor;

import org.example.oops.modal.Student;
import org.example.oops.modal.User;

public class Example1
{
    public static void main(String[] args)
    {
        System.out.println(Example2.sum(10,15));
        Example2 example2 = new Example2(); // object 1
        example2.testMethod();
        example2.a = 24;
        System.out.println(example2.a);
        Example2 example21 = new Example2(); // object 2
        System.out.println(example21.a);

        User user1 = new User("manoj","vikash@gmail.com",22);

        //User user12 = user1;

        User user11 = new User(user1);

        //System.out.println(user1.name);
        //System.out.println(user1.age);
        user1.printUserDetails();
        User user2 = new User("yuvraj","vakul@gmail.com",24);
        //System.out.println(user2.name);
        //System.out.println(user2.age);
        user2.printUserDetails();
        System.out.println(" ----------- ");
        Student student1 = new Student();
        student1.setName("ashish");
        System.out.println(student1.getName());
        System.out.println(student1.getEmailId());

        Student student2 = new Student();
        student2.setEmailId("roshni@gmail.com");
        System.out.println(student2.getName());
        System.out.println(student2.getEmailId());
        System.out.println("***********");
        Student student3 = new Student();
        System.out.println(student3.getAge());
        student3.printData();
        student3.setAge(25);
        System.out.println(student3.getAge());
        student3.printData();

        Student student4 = new Student();
        System.out.println(student4.getAge());
        student4.printData();
        student4.setAge(45);
        System.out.println(student4.getAge());
        student4.printData();

        Student student5 = new Student();
        student5.printData();


    }
}

class Example2
{
    // constructor
    Example2()
    {
        System.out.println("inside Example2 constructor");
    }

    int a = 10;
    static int b = 5;

    public void testMethod()
    {
        System.out.println(" inside at testMethod");
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }

}
