package org.example.recursive;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1)
        {
            return n;  // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}

