package org.example.overview;


/*

BODMAS: breacket, off (expo), Divide, multiply, addition, subtraction
    operator: 
    1. arthematic : +, -, *, /, %
    2. assignment   : =, +=, -=, *=, /=,
    3. unary ( increment / decrement): ++, -- ( prefix & postfix)
    4. relational: <, >, <=, >=, == !=
    5. logical: &&, ||, NOT !,  Discrete Mathematics
    6. bitwise: & AND, | OR, ^ XOR (exclusive or), ~ (bitwise not): Discrete Mathematics
    7. shift operator: <<, >>, >>>
    8. ternary: ? :

    oprator precedence:
    1.  p: post++, post--
    2.  u: ++pre, --pre, !
    3.  m: *, / %
    4.  a: + -
    5.  s: << >> >>>
    6.  r: <, >, <=, >= instance of
    7.  e: ==, !=
    10. b: &
    11. b: exclusive or ^
    12. b: |
    13. l: &&
    14. l: ||
    15. t: ? :
    16. a: =, +=, -=, /=, *=

 */

public class JavaOperator 
{

    public static void main(String[] args) 
    {
        System.out.println(" at Java Operators Example");
        //arthematicOperator();
        //assignmentOperator();
        //unaryOperator();
        //testUnary();
        //relationalOperator();
        //logicalOperator();
        //bitwiseOperator();
        //shiftOperator();
        //testShiftOperator();
        terneryMethod();
    }
    

    public static void arthematicOperator()
    {
        int a = 10;
        int b = 5;
        int c = (int)(a + b);
        System.out.println(c);
        System.out.println(a + b); // addition mathematics
        String strA = "10";
        String strB = "5";
        char ch1 = 0;
        System.out.println(ch1);
        char ch2 = 0;
        char ch3 = (char)(ch1 + ch2);
        System.out.println(ch1 + ch2);
        System.out.println(ch3);
        System.out.println(strA + strB); // concate
        int aa = 4;
        int bb = 6;
        int cc = aa - bb;
        System.out.println("cc: "+cc);
        String strVal1 = "10";
        String strVal2 = "5";
        //String strMinus = strVal2 - strVal1;
        char ch4 = (char)(ch1 - ch2);
        System.out.println(ch2 - ch1);
        // divide: /
        // modulus: %
        int div1 = 7;
        double div2 = 2.4;
        double divResDouble = div1 / div2;
        int divResInt = (int)(div1 / div2);
        System.out.println("------");
        System.out.println(divResDouble);
        System.out.println(divResInt);
        System.out.println("------");
        System.out.println(div1 / div2); // 3
        System.out.println(div1 % div2); // 1
        char ch5 = 1;
        char ch6 = 0;
        System.out.println(ch5);
        System.out.println(ch5 + ch6);
    }

    public static void assignmentOperator()
    {
        // =, +=, -=, *=, /=, %=
        int a = 10;
        System.out.println(a);
        a += 4;
        System.out.println(a);
        String fullName = "vikash";
        fullName += "saini";
        System.out.println(fullName);
        boolean boolValue  = true;
        String boolToStr = String.valueOf(boolValue);
        System.out.println("boolToStr "+boolToStr);
        char ch = 61 + 5;
        System.out.println("ch: "+ch);
        char c1 = 'a';
        char c2 = 5;
        c1 += c2;
        System.out.println("c1: "+c1);
        char c1_cd = 10 + 5;
        char c3 = 'a';
        char c1_c2 = (char) (c2 + c3);
        System.out.println("c1_c2: "+c1);
        double d1 = 10;
        double d2 = 5;
        int d1_d2 = (int) (d1 + d2);

        char ch_00 = 12;
        char ch_01 = 61;
        //ch_01 = ch_01 + ch_00;
        ch_01 = 12 + 61;
        int ch_044 = ch_01 + ch_00;
        int in_01 = 10;
        double db_01 = 5;

        //char cho_3 = 0 + ch_00; 

        System.out.println("ch_01: "+ch_01);

        int m_1 = 10;
        m_1 -= 4; 
        System.out.println("m_1: "+m_1);
        String m_str1 = "test";
        m_str1 += "java";
        char m_ch1 = 'z';
        m_ch1 -= 'D';
        System.out.println("m_ch1: "+m_ch1);
    }

    public static void unaryOperator()
    {

        // prefix & postfix
        // ++, --
        // ++: for increase value to one
        // --: to decrease value by one
        // prefix: first increase/decrease value then assign
        //post: fist assign value then increase/decrease value
        int a = 10;
        int b = 10;
        int c = 10;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("--------");
        a = a++; // 10
        c = a++; // 11,  c:10
        a = a++; // 11, c:10
        b = a++; // 12, a:12, b:11
        a = a--; // 12, a:12
        c = a--; // 11,   c:12
        b = a--; // a:10,  b:11
        System.out.println("a: "+a);//8,   anurag:10
        System.out.println("b: "+b);//9,   11
        System.out.println("c: "+c);//10   12,
        System.out.println("--------");
        int d = 15;
        int e = 14;
        int f = 13;
        e = d++; // e:15 f:13 d:16
        d = d++; // e:15 f:13 d:16
        e = e++; // e:15 f:13 d:16
        f = e--; // e:14 f:15 d:16
        e= e--; //  e:14 f:15 d:16
        f = f++; // e:14 f:15 d:16
        f = d--; // e:14 f:16 d:15
        f= d++; // e:14 f:15 d:16
        d = f--; // e:14 f:14 d:15
        // 15, 14, 14
        /// d, e and f,  15, 15, 14
        System.out.println("d: "+d);
        System.out.println("e: "+e);
        System.out.println("f: "+f);
        System.out.println("--------");
        int g = 9;
        int h = 10;
        int i = 8;
        i = ++g; // g: 10  h: 10  i: 10
        g = ++g; // g: 11  h: 10  i: 10
        h = h++; // g: 11  h: 10  i: 10
        h = ++h; // g: 11  h: 11  i: 10
        i = ++g; // g: 12  h: 11  i: 12
        i = ++i; // g: 12  h: 11  i: 13
        g = g++; // g: 12  h: 11  i: 13
        g = ++g; // g: 13  h: 11  i: 13
        g = g++; // g: 13  h: 11  i: 13
        h = ++h; // g: 13  h: 12  i: 13
        i = g++; // g: 14  h: 12  i: 13
        System.out.println("g: "+g); // 14
        System.out.println("h: "+h); // 12
        System.out.println("i: "+i); // 13
        //      15  +  12 + 15
        //      15  +  12 + 16 
        //      14  +  12 + 16 
        int k = g++ + --i + ++g;
        System.out.println("k: "+k); // 41

    }

    public static void testUnary()
    {
        int a = 5;
        int b = 1;
        //int c = a++ + b-- + ++a + --b; // 
        //System.out.println("c: "+c);
        int c = ++a + --b + a++ + a--;
        //       6 + 0    + 6 +   7
        System.out.println("c: "+c);
    }


    public static void relationalOperator()
    {
        // <, >, <= , >=, ==, !=
        int a = 10;
        int b = 10;
        System.out.println( a <= b); // 
        System.out.println( a >= b); // 
        System.out.println( a == b); // 
        System.out.println( a != b); //
    }

    public static void logicalOperator()
    {
        /*
         1. && ( AND )
         2. || ( OR )
         3. !  ( NOT )
        */
        /*       Logical AND
            condition 1   condition 2      result 
               true         true           true
               true         false          false
               false        true           false
               false        false          false

               /*       Logical OR
            condition 1   condition 2      result 
               true         true           true
               true         false          true
               false        true           true
               false        false          false

               !true = false
               !false = true
               NOT (toggle) true ka false, and false ka true
         */

         int a = 10;
         int b = 5;
         int c = 6;
         // logical need atleast two condition
         System.out.println( a > b && b > c );
         System.out.println( a > b || b > c );
        
         //                    t   &&  f    ||  t
         System.out.println( a > b && b > c || a > c );
         System.out.println( a > b && b > c && a > c );
         System.out.println( a > b && (b > c && a > c) );
         System.out.println( a > b || (b > c && a > c) );
         boolean d = true && false;
         System.out.println("d: "+d);
         /*
            int a = 10;
            int b = 5;
            int c = 6;
          */
         boolean f = a > b && b < c || b == a && b < a; // t
         boolean g = a > b && b < c && b == a && b < a; // f
         boolean k = a > b && b < c && b == a || b < a; // t
         System.out.println("f: "+f);
         System.out.println("g: "+g);
         System.out.println("k: "+k);
         //                  f    &&  t    || t
         System.out.println(a < b && (b < c || c > b));
         //                   f   ||   t
         System.out.println(a < b || (b < c && c > b));
         //                   f   ||  t    && f
         System.out.println(a < b || b < c && c < b);
         /*
            int a = 10;
            int b = 5;
            int c = 6;
          */
         ///                 f &&    t: f  &&  
         System.out.println(a < b && !(b < c) && c < b);
         System.out.println(a < b && b < c || c > b);
        //                   f   &&   t
         System.out.println(a < b && !(b < c || c > b));
         // t || 
         boolean m = !(a > b);
         System.out.println("m: "+m);
    }


    public static void bitwiseOperator()
    {
        System.out.println(" at bitwiseOperator method");
        /*
         1. & ( AND )
         2. | ( OR )
         3. ^ ( XOR )
        */
        /*              Bitwise AND
            condition 1   condition 2      result 
               true         true           true
               true         false          false
               false        true           false
               false        false          false

                       Bitwise OR
            condition 1   condition 2      result 
               true         true           true
               true         false          true
               false        true           true
               false        false          false

                     Bitwise XOR (^)
            condition 1   condition 2      result 
               true         true           false
               true         false          true
               false        true           true
               false        false          false
         */

        int a = 10;
        int b = 5;
        int c = 6;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println("a & b: "+(a & b));
        System.out.println("a & b: "+(a | b));
        System.out.println("a & c: "+(a & c));
        int d = 5; // 101
        int e = 6; // 110
        System.out.println(d & e);
        System.out.println(e & d);
        System.out.println((a & b) > (a & c));
        //System.out.println(a & b > a & c);
        /*
            int a = 10; // 1010
            int b = 5; //   101
            int c = 6; //   110
            a & c :  1010
                     0110
                     -----
                        0010
                         101 
                     -----
         */
        System.out.println(a & c & b);//0
        System.out.println(a ^ b);
        System.out.println("&&&&&&&&");
        byte bb = (byte)130;
        System.out.println("bb: "+bb);
        byte f = 10; // 1010
        byte g = 11; // 1011
        System.out.println("------------");
        System.out.println(f);
        System.out.println(g);
        //System.out.println(Integer.toBinaryString(f));
        //System.out.println(Integer.toBinaryString(g));
        System.out.println(f & g);//  1010
        System.out.println(f | g); // 1011
        System.out.println(f ^ g); // 0001
        //
    }

    public static void shiftOperator()
    {
        // <<:  left shift
        // >>:  right
        // >>>: unsinged right shift
        System.out.println("---------");
        // 5:      00000000 00000000 00000000 00000101
        // Invert all bits (one's complement):
        //         11111111 11111111 11111111 11111010
        // Now Add 1 to the above bits (to find the two's complement):
        // result: 11111111 11111111 11111111 11111011
        int a = -5;
        //11111111 11111111 11111111 11111011
        System.out.println("a: "+a);
        System.out.println("a binary: "+Integer.toBinaryString(a));
        a = a >> 2;
        //00111111 11111111 11111111 11111110
        System.out.println("a: "+a);
        System.out.println("a after right binary: "+Integer.toBinaryString(a));
        System.out.println("---------");
        System.out.println("----unsigned right shift-----");
        int u = -5;
        //11111111 11111111 11111111 11111011
        System.out.println("u: "+u);
        System.out.println("u binary: "+Integer.toBinaryString(u));
        u = u >>> 2;
        //111111111111111111111111111110
        //00111111 11111111 11111111 11111110
        System.out.println("u after unsigned: "+u);
        System.out.println("u after unsigned right shift binary: "+Integer.toBinaryString(u));
        System.out.println("---------");
        /*
        int b = 20;
        System.out.println("b: "+b);
        System.out.println("b binary: "+Integer.toBinaryString(b));
        b = b << 2;
        System.out.println("b: "+b);
        System.out.println("b after left shift binary: "+Integer.toBinaryString(b));
        System.out.println("---------");
        */
        /*
        int c = -10;
        System.out.println("c: "+c);
        System.out.println("-c binary: "+Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(3)); // 00000011 , 1111100

        //using bitwise NOT operator
        // 3:       00000000 00000000 00000000 00000011
        // after ~: 11111111 11111111 11111111 11111100
        int d = ~3;  //   00
        System.out.println("d: "+d);
        System.out.println("d binary: "+Integer.toBinaryString(d));
        */

        //Binary to int
        String binaryString = "1010";
        int number1 = Integer.parseInt(binaryString, 2);
        //Integer number1 = Integer.valueOf(binaryString, 2);
        System.out.println(number1);
        //Handle Large binar
        String largeBinaryString = "11111111111111111111111111111011";
        int number2 = (int) Long.parseLong(largeBinaryString, 2);
        System.out.println(number2);


    }


    public static  void testShiftOperator()
    {
        // <<, >> and >>>
        // with negative number
        int a = -5;
        System.out.println("a: "+a);
        String aInBinaryString = Integer.toBinaryString(a);
        System.out.println("a binary "+aInBinaryString);
        System.out.println("a binary length "+aInBinaryString.length());
        long binaryToNumber = (int) Long.parseLong(aInBinaryString,2);
        System.out.println("binaryToNumber "+binaryToNumber);
        int b = -5;
        System.out.println("b: "+b);
        b = b >> 2;
        System.out.println("b: "+b);
        System.out.println("b binary "+Integer.toBinaryString(b));
        System.out.println("b binary length "+Integer.toBinaryString(b).length());
        // 00111111111111111111111111111110
        // 11111111111111111111111111111110
        long binaryToNumber2 = (int) Long.parseLong("11111111111111111111111111111110",2);
        System.out.println(binaryToNumber2);
    }

    public static void terneryMethod()
    {
        // 1 ?  (question mark)
        // 2 :  (colon)
        System.out.println(" at terneryMethod ");
        int a = 30;
        int b = 35;
        String whoIsBigger;
        boolean is_A_Bigger = false;
        if (a > b) 
        {
            //   
            whoIsBigger = "a is bigger"; 
            is_A_Bigger = true;
        }
        else
        {
            whoIsBigger = "b is bigger"; 
        }
        System.out.println("whoIsBigger: "+whoIsBigger);
        System.out.println("is_A_Bigger: "+is_A_Bigger);
        int c = 29;
        int d = 25;
        // ? if,
        // : else
        // using ternery with two values
        String is_C_Bigger = c > d ? "yes" : "no";
        System.out.println("is_C_Bigger: "+is_C_Bigger);
        
        // using ternery with three values
        whoIsBigger = a > b  ?   a > c ? "a" : "c"     :  b > c ?  "b" : "c" ;
        System.out.println("whoIsBigger: "+whoIsBigger);
        // with && operator
        whoIsBigger = a > b && a > c ? "a"  : b > c ? "b" : "c";
        System.out.println("whoIsBigger: "+whoIsBigger);
        // a, b, c, d
    }


}
