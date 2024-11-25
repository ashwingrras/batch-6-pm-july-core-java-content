package org.example.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args)
    {
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1,"vakul");
        stringMap.put(2,"ashish");
        //stringMap.put(3,"vikash");
        stringMap.put(4,"abhishek");
        stringMap.put(5,"roshni");
        System.out.println("string map = "+stringMap);
        System.out.println(stringMap.get(4));
        Map<Double, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put(10.7,"vakul");
        stringStringHashMap.put(10.71,"vakul");
        System.out.println(stringStringHashMap);
        System.out.println(stringStringHashMap.get("vakul"));

    }
}
