package org.example.lambda_expression;

interface StringFunction {
    String run(String str);
}


public class LambdaWithStringFormat {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Aha", exclaim);
        printFormatted("How Are You", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

