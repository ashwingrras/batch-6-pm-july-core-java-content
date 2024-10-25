package org.example.oops.wrapper_class;

import org.example.oops.aggregation.Student;

import java.util.ArrayList;

public class Example1
{
    public static void main(String[] args)
    {
        int a = (int)12345678901L;
        double d = 16.5;
        Integer aa = (int)12345678901L;
        Integer ab = null;
        // null
        Double cd = null;
        Character c = null;
        Float f;
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Student> arrayList3 = new ArrayList<>();
        ArrayList<Object> arrayList4 = new ArrayList<>();

        int a1 = 10;
        Integer a2 = a1; // autoboxing
        System.out.println(a1);
        int a3 = a2; // unboxing
        double d1 = 10;
        int aaa = Integer.parseInt("10");
        String strToInt = Integer.toString(100);
        System.out.println(strToInt);
        String strr = ""+100;
        String str = String.valueOf(100);

    }

}
