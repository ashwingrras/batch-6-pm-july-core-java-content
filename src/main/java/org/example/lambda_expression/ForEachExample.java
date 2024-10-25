package org.example.lambda_expression;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Prerna");
        names.add("Nischal");
        names.add("Raju");
        // Using forEach to print each element of the list
        // lambda expression
        names.forEach(name -> System.out.println(name));
        // Alternatively, you can use method reference for simplicity
        names.forEach(System.out::println);
    }

}
