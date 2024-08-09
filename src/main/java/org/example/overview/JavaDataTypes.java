package org.example.overview;    /*
    keywords: approx 51 keywords(reverved words)
    public, class, static, void, String, int
    */

    //data types
    //variable types

    // ' ' : single quote
    // ""  : double quote  
    // ()  :  brackets
    // {}  : curly brackets
    //  ;  : semi colon
    
    /* Data Type , Literals
     primitive: where value is pre defined or value given
     bit > byte > kb > mb > gb > tb > pb

     8 bit      :  1 byte
     1024 byte  :  1 kb
     1024 kb    :  1 mb
     1024 mb    :  1 gb
     1024 gb    :  1 tb
                    : size       range                 default value
     1. int          4 byte                                    0
     2. float        4                                         0.0F
     3. double       8                                         0.0
     4. long         8                                         0L
     5. short        2           -32768 to 32767               0
     6. byte         1           -128 to 127                   0
     7. char         2                                         '\u0000'
     8. boolean      1 bit                                    false

     non-primitve: where value is not defined, only we have reference / object
     1. String:      default value: null
     2. Array
     3. Class & Objects

     variables:
     1. local variable: block scope or method level scope
     2. instance variable: class level scope
     3. static variable: project level scope
    */

import java.util.Arrays;

public class JavaDataTypes
{ 
    static float a;
    public static void main(String[] args) 
    {
        System.out.println(" int a with without define: "+a);
        System.out.println("at JavaDataTypes Class");
        String name = "vijay";
        int age = 24;
        //String int = "abcd";
        String[] students = {"ashwin","aman","mitasha","rahul"};
        System.out.println("name = "+name);
        System.out.println("age = "+age);
        System.out.println("students = "+students);
        // DATA TYPES
        // 49.50 rs
        // non decimal types
        int a = 12;
        short s = 32;
        byte b = 127;
        long l = 123456789012L;
        // decimal
        double d = 10.00;
        float f = 10.09F;
        System.out.println("d = "+d);
        //
        char c = '0';
        System.out.println("c = "+c);
        System.out.println('\u0000');
        //
        boolean bool = true; // true/false

        //Non-Primitive Data Types
        //String immutable ( non-changable)
        // First object with value ashish
        String userName = "ashish";
        //System.out.println("userName: "+userName);
        // new object / Second object with value ashish
        userName = "vijay";
        System.out.println("userName: "+userName);
        userName = "vijay";
        String value1 = "Hello";
        String value2 = "Hello";
        String value3 = new String("Hello");
        System.out.println(value1 == value2); // true , here java checks reference
        System.out.println(value1 == value3); // false, here java checks reference
        System.out.println(value1.equals(value3)); // true, here java checks value
        System.out.println("---------------------");

        // concate is use to append or add to string, like a.concat(b) so value as: ab
        String studentName = "ajay";
        //studentName.concat(" devgan");
        //studentName = studentName.concat(" devgan");
        System.out.println("studentName: "+studentName);

        String studentName1 = "ajay";
        System.out.println(" now checking string ref");
        System.out.println(studentName == studentName1); // reference
        System.out.println("---------------------");

        /*
        JavaDataTypes javaDataType1 = new JavaDataTypes();
        System.out.println("javaDataType1 object: "+javaDataType1);
        javaDataType1.showData();
        JavaDataTypes javaDataType2 = new JavaDataTypes();
        System.out.println("javaDataType2 object: "+javaDataType2);
        */
        //
        int[] intArray = {2, 3, 5, 1, 6};
        System.out.println("intArray: "+intArray);
        System.out.println("intArray: "+Arrays.toString(intArray));
        String[] strArray = {"aman","raman"};
        System.out.println("strArray: "+strArray);
        System.out.println("intArray: "+Arrays.toString(strArray));
        String[] strArray2 = new String[5];
        System.out.println("strArray2: "+strArray2);
        System.out.println("intArray: "+Arrays.toString(strArray2));
    }

    public void showData()
    {
        System.out.println("at showData");
    }

}
