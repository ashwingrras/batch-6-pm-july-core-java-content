package org.example.oops;

/*

    variables :
    1. local :
        1.1 method level scope
    2. instance :
        2.1 class level scope
        2.2 directly can use on non-static method
        2.3 if we want to use on static, then we have to create that class object
    3. static   :
        3.1 class level scope , reference will create while running
        3.2 directly can use on both static and non-static method

    methods:
    1. non-static :
        1.1  directly can call both static and non-static method
        1.2  directly use both static and non-static variables
    2. static :
        2.1 directly can call static method
        2.2 if we want to call non-static method then we have to create that class object
        2.3 directly can use only static variable
        2.3 if we want to use non-static variable then we have to create that class object


    Access Modifier
    1. public :
        1.1 allow access on whole project
        1.1 allow to create class
    2. private :
        2.1 allow only inside class
    3. default :
        3.1 allow on same package
        3.1 allow to create class
    4. protected:
        4.1 allow on same package but also allow on different package with relation ( inheritance )


    OOPS
    1. constructor
        1.1 default
        1.2 parameterized
        1.3 copy
    2. encapsulation : setter/getter
    3. inheritance
       3.1 single
       3.2 multi level
       3.3 hierarchical
       3.4
    4.

    A : sum
    B : sum

    class c  implements A, B
    sum()

 */

public class OopsExample1
{
    int a = 10; //instance variable
    static int b = 5; // static variable



    public static void main(String[] args)
    {
        OopsExample1 oopsExample1 = new OopsExample1(); // new object / new reference
        System.out.println(oopsExample1.a);
        int a = 6; // local variable
        System.out.println(b);
        System.out.println(a);
        oopsExample1.sum();
        divide();
    }


     void sum()
    {
        System.out.println(a);
        System.out.println(b);
        a = 7; // instance
        int a = 10; // local
        int b = 5;
        int sum = a + b;
        //multiply();
    }

    public void multiply()
    {
        int a = 10;
        int b = 5;
        int multiply = a * b;
        //divide();
    }

    public  static  void divide()
    {
        int a = 10;
        int b = 5;
        int divide = a / b;
    }

}
