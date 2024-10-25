package org.example.lambda_expression;

@FunctionalInterface
interface Sayable {
    String say(String message);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

//        AddLambdaInterface add = ( a, b) -> {
//           return a + b;
//        };
        // block lambda experssion
        Sayable person = (message)-> {
            String str1 = "Hello, ";
            String str2 = str1 + message; // concat
            return str2;
        };
        System.out.println(person.say("how are you"));
    }
}

