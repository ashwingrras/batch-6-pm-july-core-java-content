package org.example.string_handling;

public class StringExample1
{
    public static void main(String[] args)
    {
        String rollNo = "1001";
        rollNo = "1002";
        String rollNo1 = "1002";
        rollNo = "1003";
        int a = 10;
        // non-primitive data type
        // String, Array, Class, Interface and Object
        // String in immutable ( jisko hum change nhi kar sakte / jo change nhi hoti hai)
        // First way of initialize String
        String name = "lakskhay"; // new object / reference
        System.out.println("name : "+name);
        //name.concat(" awasthi");
        name = name.concat(" awasthi");
        System.out.println("name with surname : "+name);
        String name2 = "lakskhay"; // no new object / it will get reference of name variable
        name = "vakul"; // new object / reference
        name2 = "vijay"; // new object / reference
        // Second way of initialize String
        String stringValue1 = "yogesh"; // new object / reference
        String stringValue2 = new String("yogesh").intern(); // new object / reference
        String stringValue3 = "yogesh"; // it will take reference of stringValue1
        System.out.println("name : "+name);
        StringExample1 stringExample1 = new StringExample1();
        System.out.println("stringExample1 : "+stringExample1);
        String[] names = new String[5]; //{"lakshay","vakul","yogesh","vijay"};
        System.out.println("names : "+names);
        System.out.println( stringValue1 == stringValue2); // it will checks the reference
        System.out.println( stringValue1 == stringValue3); // it will checks the reference
        System.out.println( stringValue2 == stringValue3); // it will checks the reference
        String stringValue4 = new String("yogesh").intern();
        System.out.println( stringValue2 == stringValue4); // it will checks the reference
        System.out.println(names.length);
        String emailId = "vakul";
        System.out.println(emailId.length());
        char[] emailIdArray = {'a','b','c'}; //emailId.toCharArray();
        System.out.println(emailId.toCharArray());
        System.out.println(emailIdArray);
        String no = "1234";
        char [] noStringArray = no.toCharArray();
        System.out.println(noStringArray);
    }

}
