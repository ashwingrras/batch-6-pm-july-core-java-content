package org.example.lambda_expression;

import java.util.Arrays;

interface Add{
    int getStrlen(String a);
}
public class StringLengthByLambda {

    private double data;

    public static void main(String[] abcd)
    {
        Add get = (a) -> a.length();       //LAMBDA EXPRESSION For getting string length numbers
        System.out.println(get.getStrlen("ashwin"));
        sum(2, 5);
        sum(2.5, 5.5);
        StringLengthByLambda stringLengthByLambda = new StringLengthByLambda();
    }

    public static int sum(int a, int b)
    {
        int sum = a +b;
        return sum;
    }

    public static double sum(double a, double b)
    {
        double sum = a +b;
        return sum;
    }


}
