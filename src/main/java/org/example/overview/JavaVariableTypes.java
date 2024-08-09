package org.example.overview;/*
    variables:
     1. local variable: block scope or method level scope
     2. instance variable: class level scope
     3. static variable: project level scope
 */

public class JavaVariableTypes 
{

    // instance variable, class level scope, we can use in all only non-static method
    // of this class
    String name = "vijay"; // instance
    
    //static variable, we can use in all method (both static & non-static)
    static String college = "icfai"; // static
    public static void main(String[] args) 
    {
        
        ////System.out.println(name); // not working
        // local variable
        System.out.println(college);
        String name = "aman";
        int value = 10;
        System.out.println(name);
        String college = "poornima";
        System.out.println(college);
        ////
        JavaVariableTypes javaVariableTypes = new JavaVariableTypes();
        javaVariableTypes.showData();
    }

    //non-static method
    public void showData()
    {
        System.out.println("at showData method");
        System.out.println(name);
        System.out.println(college);
        //local variable
        String data = "Hello Guys";
        String name = "aman";
        int value = 10;
        System.out.println(name);
        String college = "jecrc";
        System.out.println(college);
        printData();
    }

    //static method
    public static void printData()
    {
        System.out.println("at printData method");
    }
    
}
