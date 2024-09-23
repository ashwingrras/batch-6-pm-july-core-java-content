package org.example.recursive;


/*
    factorial of 5 : 5 * 4 * 3 * 2 * 1 = 120
    factorial of 4 : 4 * 3 * 2 * 1 = 24

 */

public class FactorialExample {

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    public static int factorial(int n) {
        // Base case
        if (n == 0)
        {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
    /*
        Steps as:
        1. return 5 * factorial(4)
        2. return 4 * factorial(3)
        3. return 3 * factorial(2)
        4. return 2 * factorial(1)
        5. return 1 * factorial(0) : return 1

        1 * 1 : 1
        2 * 1 : 2
        3 * 2 : 6
        4 * 6 : 24
        5 * 24 : 120


        return 1;

        5
        4
        3
        2
        1

        0

        return value = 1


     */

}

/*
Explanation:
 */