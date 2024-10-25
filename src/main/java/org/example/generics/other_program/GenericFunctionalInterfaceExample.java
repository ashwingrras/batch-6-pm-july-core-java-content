package org.example.generics.other_program;

@FunctionalInterface
interface Converter<T, R> {
    R convert(T input);
}


public class GenericFunctionalInterfaceExample {

    public static void main(String[] args) {
        // Lambda expression to implement Converter<String, Integer>
        Converter<String, Integer> stringLengthConverter = str -> str.length();

        // Using the converter to get the length of a string
        String inputString = "Hello, World!";
        Integer length = stringLengthConverter.convert(inputString);
        System.out.println("Length of the string: " + length); // Output: 13

        ////
        Converter<Double, String> doubleToStringConverter = num -> "Value: " + num.toString();

        Double inputValue = 3.14;
        String stringValue = doubleToStringConverter.convert(inputValue);
        System.out.println("Converted string: " + stringValue); // Output: "Value: 3.14"

    }
}

