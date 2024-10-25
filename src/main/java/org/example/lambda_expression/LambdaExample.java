package org.example.lambda_expression;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaExample {

    public static void main(String[] args)
    {


        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20)); // Output: 30

        ///
        IntBinaryOperator sum = (a, b) -> a + b;
// Using the lambda expression
        int result = sum.applyAsInt(10, 20);
        System.out.println("result "+result);

    }

}
