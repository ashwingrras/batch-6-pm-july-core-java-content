package org.example.lambda_expression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface AddValue
{
    void getAdd(int a,int b);
    //
    default int getMultiply(int a, int b)
    {
        return a * b;
    }

}
public class Lambda
{
    public static void main(String[] args)
    {
        AddValue addValue = new AddValue() {
            @Override
            public void getAdd(int a, int b) {

            }
        };
        AddValue add = (int a, int b) -> {
            System.out.println(a * b);
        };
        System.out.println("add "+add);
        add.getAdd(2,19);
        System.out.println(add.getMultiply(10,4));
        //System.out.println(add1);

        int add2 = getAdd(10,4);
        System.out.println(add2);

        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(4));
        //
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Hello, World!");

        Consumer<String> printMessageMethodReference = System.out::println;
        printMessageMethodReference.accept("Hello, World!");
        //
        ArrayList<String> names = new ArrayList<>();
        names.add("vikash");
        names.add("vakul");
        names.forEach( name -> { System.out.println(name); });
        for(String name : names)
        {
            System.out.println(name);
        }
    }

    public static int getAdd(int a, int b)
    {
        return a * b;
    }


}

