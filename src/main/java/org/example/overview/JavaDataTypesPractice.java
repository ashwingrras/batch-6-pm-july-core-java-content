package org.example.overview;

import java.util.Arrays;


/*
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
 */

public class JavaDataTypesPractice 
{
    public static void main(String[] args) 
    {
        // primitve
        int a = 10;
        int c = 10;
        System.out.println(a == c);
        System.out.println("a: "+a);
        // non-primitve
        int b[] = {10,20,30};
        System.out.println("b: "+b);
        System.out.println("b: "+b[2]);
        b[1] = 15;
        System.out.println("b array: "+Arrays.toString(b));
        String name1 = "aman";
        System.out.println("name1: "+name1);
        String name2 = "aman"; //new String("aman");
        String name3 = new String("aman");
        System.out.println("name2: "+name2);
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);

        JavaDataTypesPractice javaDataTypesPractice1 = new JavaDataTypesPractice();
        System.out.println("javaDataTypesPractice1: "+javaDataTypesPractice1);
        JavaDataTypesPractice javaDataTypesPractice2 = new JavaDataTypesPractice();
        System.out.println("javaDataTypesPractice2: "+javaDataTypesPractice2);

        double d = 10.0;
        System.out.println("d: "+d);
        float f = 10.0F;
        System.out.println("f: "+f);
        int ab = (int)10.0;
        long dd = 12345678901L;
        short sh = 32767;
        byte bb = (byte)131;
        System.out.println("byte bb: "+bb);
        char ch = '\u0000';
        System.out.println("ch: "+ch);
    }
    
}
