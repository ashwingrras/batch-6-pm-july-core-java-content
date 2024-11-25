package org.example.collection_framework;

import java.util.*;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("vakul");
        linkedList1.add("ashish");
        linkedList1.add("roshni");
        linkedList1.add("vikas");
        System.out.println(linkedList1.peek());
        System.out.println(" linkedList1 = "+linkedList1);
        System.out.println(linkedList1.remove());
        System.out.println(linkedList1.removeFirst());
        System.out.println(" linkedList1 = "+linkedList1);
        System.out.println(linkedList1.poll());
        System.out.println(" linkedList1 = "+linkedList1);
        System.out.println(linkedList1.peek());
        System.out.println(linkedList1.offer("rohan"));
        linkedList1.add("yuvraj");
        System.out.println(" linkedList1 = "+linkedList1);
        linkedList1.offerFirst("ashwin");
        System.out.println(" linkedList1 = "+linkedList1);
        System.out.println(linkedList1.indexOf("yuvraj"));
        linkedList1.offerFirst("ashwin");
        System.out.println(" linkedList1 = "+linkedList1);
        System.out.println("getFirst() = "+linkedList1.getFirst());
        System.out.println("get(2) = "+linkedList1.get(2));
        for(String value : linkedList1)
        {
            System.out.println(" value "+value);
        }
        // mango, mango, mango, apple, grapes
        for(int i =0; i < linkedList1.size(); i++)
        {
            if(linkedList1.get(i).equalsIgnoreCase("mango"))
            {
                linkedList1.remove(i);
            }
        }



        Stack<String> stack = new Stack<>();




        Queue<String> queue = new ArrayDeque<>();
    }

    public int sum(int a, int b)
    {
        return  a + b;
    }

}
