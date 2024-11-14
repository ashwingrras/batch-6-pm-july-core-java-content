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
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("vakul");
        arrayList.add("roshni");
        arrayList.add("vansh");
        System.out.println("arrayList "+arrayList);
        arrayList.add(1, "yogesh");
        System.out.println("arrayList "+arrayList);
        //ArrayList<String> arrayList1 =  arrayList;
        ArrayList<String> arrayList1 =  new ArrayList<>();
        //arrayList1.addAll(arrayList);
        System.out.println("arrayList1 : "+arrayList1);
        arrayList1.add("abhishek");
        System.out.println("arrayList1 : "+arrayList1);
        System.out.println("arrayList "+arrayList);
        System.out.println(arrayList.getFirst());
        arrayList.set(0, "vikash");
        System.out.println(arrayList.contains("vikash"));
        System.out.println(arrayList.hashCode());
        System.out.println(arrayList.indexOf("roshni"));

        // enhanced for
        for(String value : arrayList)
        {
            System.out.println("value "+value);
        }

        // forEach
        arrayList.forEach(item -> System.out.println("item : "+item));

        for(int i =0; i < arrayList.size(); i++)
        {
            System.out.println(" value = "+arrayList.get(i));
        }

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student(1001, "yogesh");
        Student student2 = new Student(1002, "vakul");
        Student student3 = new Student(1003, "ashsih");
        Student student4 = new Student(1004, "abhishek");
        Student student5 = new Student(1004, "abhishek");
        student5.setName("salman khan");
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        System.out.println(studentArrayList.size());
        System.out.println(" studentArrayList: "+studentArrayList);
        for(Student student : studentArrayList)
        {
            System.out.println(student.name);
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("aman");
        ///////////////////////

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("ashish");
        arrayLists.add(arrayList2);
        System.out.println(arrayLists);
        for(ArrayList<String> string : arrayLists)
        {
            System.out.println(string.getFirst());
        }
        String abc = arrayLists.get(0).get(0);

        /////
        //Collections.sort(arrayList);

        // Sort the ArrayList by string length
        //arrayList.sort((a, b) -> a.length() - b.length());

        arrayList.sort(Comparator.comparingInt(String::length));

        //arrayList.sort(Collections.reverseOrder());

        System.out.println("sorted: "+arrayList);
        List<String> filteredNames = arrayList.stream()
                .filter(value -> value.startsWith("v"))
                .map(String::toUpperCase)
                .toList();

        List<String> filteredNames1 = arrayList.stream()
                .filter(value -> value.startsWith("v")).toList();

        System.out.println("filteredNames = "+filteredNames);

        //List<String> cloneList = (List<String>) arrayList.clone();

        List<String> normalList = new ArrayList<>();
        //normalList.
        ArrayList<String> arrayList3 = new ArrayList<>();

        long count = arrayList.stream()
                .filter(value -> value.startsWith("v"))
                .count();

        System.out.println(" count = "+count);
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println("sortedNumbers = "+sortedNumbers);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(" sum = "+sum);


    }
}
