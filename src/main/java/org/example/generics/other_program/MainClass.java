package org.example.generics.other_program;


/*
    1. generic class
    2. generic method:
    3. generic interface

 */

public class MainClass
{

    public static void main(String[] args) {

        GenericClassExample1 genericClassExample1 = new GenericClassExample1();
        genericClassExample1.setValue("abc");
        System.out.println("after set String value");
        System.out.println(genericClassExample1.getValue());
        System.out.println("after set int value");
        genericClassExample1.setValue(123);
        System.out.println(genericClassExample1.getValue());

        GenericClassExample1<String> genericClassExample1_1 = new GenericClassExample1();
        genericClassExample1_1.setValue("test value");

        GenericClassExample1<String[]> genericClassExample1_2 = new GenericClassExample1();
        genericClassExample1_2.setValue(new String[]{"a","b"});

        System.out.println(getFirstElement(new String[]{"b","a"}));

        System.out.println(getFirstElement(new Integer[] {9,5,7}));

    }

    public static <T> T getFirstElement(T[] array)
    {

        return array[0];
    }
}
