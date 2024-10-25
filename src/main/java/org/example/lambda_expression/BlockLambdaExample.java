package org.example.lambda_expression;

import java.util.ArrayList;
import java.util.function.Function;

@FunctionalInterface
interface StringProcessor {
    String processString(String str);
}


public class BlockLambdaExample {


    public static void main(String[] args) {

        StringProcessor stringProcessor = (str) -> {

            String result = str.toUpperCase();
            //result = result + " Processed";
            return result;
        };

        StringProcessor stringProcessor1 = new StringProcessor() {
            @Override
            public String processString(String str) {
                return str.toLowerCase();
            }
        };

        String input = "Nischal";
        String processedString = stringProcessor.processString(input);
        System.out.println("Processed String: " + processedString);

        String processedString1 = stringProcessor1.processString(input);
        System.out.println("Processed String: " + processedString1);

        String[] data = new String[2];
        data[0] = "football";
        data[1] = "cricket";

        ArrayList<String> list = new ArrayList<String>();
        list.add("football");
        list.add("cricket");

        for(int i=0; i <data.length; i++)
        {
            System.out.println(data[i]);
        }

        for(String i : data)
        {
            System.out.println(i);
        }

        for(String i : list)
        {
            System.out.println(i);
        }
        System.out.println("using for each with lambda");
        list.forEach(i -> System.out.println(i));
        System.out.println("using for each with method reference");
        list.forEach(System.out::println);

        //Function<Integer, String> converter = Integer::toString;
        //String result = converter.apply(10);

        String prefix = "Hello";
        prefix += " world";
        Function<String, String> concat = prefix::concat;
        String message = concat.apply(" World");
        System.out.println("message "+message);

    }

}

