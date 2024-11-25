package org.example.collection_framework;

/*

        1. List
            ArrayList
            LinkedList

        2. Set
            HashSet
        3. Map
            HashMap

        4. Queue
            ArrayDeque


 */

import java.util.*;

public class CollectionFrameworkTest
{
    public static void main(String[] args)
    {
        String name = "vakul";
        String[] names = new String[5];
        names[2] = "yoges";
        for(String value : names)
        {
            System.out.println("value "+value);
        }
        System.out.println("names "+names);
    }
}
