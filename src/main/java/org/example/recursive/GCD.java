package org.example.recursive;

public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;  // Base case: GCD(a, 0) = a
        }
        return gcd(b, a % b);  // Recursive case: GCD(b, a % b)
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}

