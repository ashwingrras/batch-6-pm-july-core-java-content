package org.example.oops.access_modifier;

/*
    1. public
    2. private
    3. protected
    4. default ( no name / label)


 */

public class Example2
{

    protected void sum()
    {

        int a = 10; // local
        int b = 5;
        int sum = a + b;
        System.out.println("sum : "+sum);
    }

}
