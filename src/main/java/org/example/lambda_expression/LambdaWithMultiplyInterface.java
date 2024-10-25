package org.example.lambda_expression;

import java.util.ArrayList;
import java.util.function.Function;


/*
    1. lambda expression
    2. functional interface
    3. forEach
    4. block lambda
    5. method reference

 */
public class LambdaWithMultiplyInterface
{
    int a = 10;

    LambdaWithMultiplyInterface()
    {
        System.out.println("LambdaWithMultiplyInterface constructor");
    }

    public static void main(String[] args)
    {

        {
            System.out.println("at block expression");
        }
        LambdaWithMultiplyInterface lambdaWithMultiplyInterface = new LambdaWithMultiplyInterface();
        // Anonymous class
        Multiply multiply = new Multiply() {
            @Override
            public int getMultiplyValue(int a, int b) {
                return a * b;
            }
        };
        System.out.println("at LambdaWithMultiplyInterface example");
        System.out.println(multiply.getMultiplyValue(5, 5));

        Multiply multiply1 = (int a, int b) -> a * b;
        Multiply multiply2 = (int a, int b) -> {
            a = a + 1;
            b = b + 1;
           return a * b;
        };
        System.out.println("using lambda expression with functional interface");
        System.out.println(multiply1.getMultiplyValue(6,6));
        System.out.println(multiply2.getMultiplyValue(7,7));

        String[] arr = new String[5];
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("devesh");
        arrayList.add("harshit");
        arrayList.add("lalit");
        arrayList.add("ansh");
        arrayList.add("yogam");
        System.out.println(arrayList);
        //arrayList.remove("harshit");
        System.out.println(arrayList);
        for(int i=0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
        System.out.println("with enhanced for");
        for(String i : arrayList)
        {
            System.out.println(i);
        }
        System.out.println("with forEach with method reference");
        arrayList.forEach(System.out::println);
        System.out.println("with forEach lambda");
        int a = 10;
        String no = String.valueOf(a);
        System.out.println(no);
        arrayList.forEach(i->System.out.println(i));
        arrayList.forEach(i-> {
            System.out.println(i);
        });
        /*Function<Integer, String> converter = Integer::toString;
        String result = converter.apply(10); // Equivalent to Integer.toString(10)
        System.out.println(result);*/
        String prefix = "Lalit";
        //METHOD REFERENCE
        Function<String, String> concat = prefix::concat;
        String message = concat.apply(" Soni");
        System.out.println(message);
    }

    {
        a = 10;
        System.out.println("at block expression outside");
    }

}
