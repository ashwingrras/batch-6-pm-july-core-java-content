package org.example.collection_framework;


import java.util.*;

public class Vector_Stack_Queue
{
    public static void main(String[] args)
    {
        /*

        */

        Vector<String> vector = new Stack<>();
        vector.add("vakul");
        vector.addElement("ashish");
        String[] strings = new String[2];
        vector.copyInto(strings);
        System.out.println(Arrays.toString(strings));
        vector.insertElementAt("vikash",0);
        System.out.println("vector "+vector);




    }
}
