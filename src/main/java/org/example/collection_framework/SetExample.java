package org.example.collection_framework;

import javax.swing.table.TableRowSorter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class SetExample
{
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ashwin");
        hashSet.add("Ashwin");
        hashSet.add("vakul");
        hashSet.add("Vakul");
        hashSet.add("ashish");
        hashSet.add("Ashish");
        hashSet.add("vikash");
        hashSet.add("Vikash");
        //System.out.println(" hashSet = "+hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("ashwin");
        linkedHashSet.add("Ashwin");
        linkedHashSet.add("vakul");
        linkedHashSet.add("Vakul");
        linkedHashSet.add("ashish");
        //System.out.println(" linkedHashSet = "+linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("ashwin");
        treeSet.add("Ashwin");
        treeSet.add("vakul");
        treeSet.add("Vakul");
        treeSet.add("ashish");
        System.out.println(" treeSet = "+treeSet);
        System.out.println(treeSet.ceiling("himaksh"));
        System.out.println(" treeSet = "+treeSet);
        TreeSet<Double> treeSetInteger = new TreeSet<>();
        treeSetInteger.add(12.0);
        treeSetInteger.add(13.0);
        treeSetInteger.add(9.0);
        treeSetInteger.add(9.5);
        treeSetInteger.add(10.0);
        treeSetInteger.add(10.5);
        System.out.println(treeSetInteger);
        System.out.println(treeSetInteger.ceiling(9.20));
        System.out.println(treeSetInteger.floor(9.20));
        treeSetInteger.pollFirst();
        System.out.println(treeSetInteger);
        System.out.println(treeSetInteger.subSet(9.5, 10.6));
        System.out.println(treeSetInteger.headSet(15.5));

        //////
        Date date = new Date();
        System.out.println("date "+ date);
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate "+ localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime "+ localTime);
        for(Double value : treeSetInteger)
        {
            System.out.println(value);
        }
        System.out.println(" with forEach ");
        //System.out.println(item);
        treeSetInteger.forEach(System.out::println);

    }

    public static void sum()
    {
        System.out.println(" abacd");
        if(true)
        {
            return;
        }
        //
        System.out.println("vikash");
    }


}
