package org.example.overview;// default : when we can't give any access modifier, it will treat as default

/*
 access modifier: public, default, protected and private
 public: outsider allow
 private: only allow inside class
 protected: outsider with same package or subclass
 default: outsider with only same package


 static : keyword
 method / function, variable
 static get memory when java run program
 */

public class JavaFirstProgram 
{
    static int a = 10;
    String name = "aman";
    // function / method
    public static void main(String[] args)
    {
        System.out.println(10 == 10);
        String name = "aman"; // different ref.
        String name2 = new String("aman"); // different ref.
        System.out.println(name == name2); // here checking reference
        System.out.println(name.equals(name2)); // here checking value
        System.out.println("name: "+name);
        String[] names = {"aman","ashwin","rohit"};
        System.out.println("names array value = "+names);
        int a = 10; // local variable
        System.out.println("This is my java first program");
        System.out.println("a value = "+a);
        JavaFirstProgram javaFirstProgram1 = new JavaFirstProgram(); // creating new object/instance
        System.out.println("javaFirstProgram1 value = "+javaFirstProgram1);
        JavaFirstProgram javaFirstProgram2 = new JavaFirstProgram(); // creating new object/instance
        System.out.println("javaFirstProgram2 value = "+javaFirstProgram2);
        javaFirstProgram1.sum(4, 6);
        System.out.println(javaFirstProgram1.name);
        JavaFirstProgram.multiply();
    }

    public static void main() 
    {

    }

    // non-static method
    public int sum(int a, int b)
    {
        int sum = a  + b;
        return sum;
    }

    public static void multiply()
    {
        int sum = 10 * 5;
    }

    public static void divide()
    {
        int sum = 10 / 2;
        JavaFirstProgram javaFirstProgram = new JavaFirstProgram(); // creating new object/instance
        javaFirstProgram.sum(5, 2);
        JavaFirstProgram.multiply();
    }


}


class SubClassOfFirstProgram

{

    public static  void callParentMethod()
    {
        JavaFirstProgram.divide();
        JavaFirstProgram javaFirstProgram = new JavaFirstProgram(); 
        javaFirstProgram.sum(5, 7);
        System.out.println(javaFirstProgram.name);
    }

}
