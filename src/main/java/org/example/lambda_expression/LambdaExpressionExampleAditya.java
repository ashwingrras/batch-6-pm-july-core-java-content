package org.example.lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
interface TestInterface
{
    int sum(int a, int b);

}

interface StringLength {
    int getStrlen(String a);
}


public class LambdaExpressionExampleAditya
{
    public static void main(String[] args) {
        // anno class
        TestInterface testInterface = new TestInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(testInterface.sum(10, 4));
        // lambda / functional interface
        TestInterface sumValue = (int a, int b) ->
        {
            System.out.println(" inside TestInterface sumValue method");
            return a + b;
        };
        System.out.println(sumValue.sum(10,6));
        // method reference
        TestInterface sumValueNew = Integer::sum;
        System.out.println(sumValueNew.sum(12,7));
        // lambda
        StringLength stringLength = (st) -> st.length();
        System.out.println("string length: "+stringLength.getStrlen("aditya"));
        StringLength stringLengthMethodRef = String::length;
        System.out.println("string length: "+stringLengthMethodRef.getStrlen("ashwin"));

        ///
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("------------Iterating by passing lambda expression--------------");
        // enhanced for loop
        for(String value : gamesList)
        {
            System.out.println("value "+value);
        }
        // forEach
        gamesList.forEach(value ->
                {
                    System.out.println("forEach value: "+value);
                }
                );
        /// method reference
        String prefix = "Hello";
        Function<String, String> concat = prefix::concat;
        String message = concat.apply(" World");
        System.out.println(" message : "+message);
        //
        List<String> names = new ArrayList<>();
        names.add("aditya");
        names.add("ashwin");
        names.add("rohan");

        Consumer<String> printName = (name) -> System.out.println(name);
        names.forEach(printName);
        // Using method reference instead of lambda expression
        names.forEach(System.out::println);


    }
}
