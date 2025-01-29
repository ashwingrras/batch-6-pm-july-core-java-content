package org.example.recursive;

public class SumOfDigits {
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;  // Base case: when the number becomes 0, return 0
        }
        return number % 10 + sumOfDigits(number / 10);  // Recursive case
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits(number));
    }
}

