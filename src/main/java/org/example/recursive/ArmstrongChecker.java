package org.example.recursive;

public class ArmstrongChecker
{
    public static void main(String[] args) {
        int testNumber = 153;

        if (isArmstrong(testNumber)) {
            System.out.println(testNumber + " is an Armstrong number.");
        } else {
            System.out.println(testNumber + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int number)
    {
        int length = String.valueOf(number).length();  // Find the number of digits in the number
        return isArmstrongRecursive(number, length, 0);
    }

    // Helper recursive function to compute the sum of digits raised to the power of the length
    private static boolean isArmstrongRecursive(int number, int length, int sum)
    {
        // Base case: when number becomes 0, check if the sum equals the original number
        if (number == 0) {
            return sum == 0;  // If the sum equals the number, it's an Armstrong number
        }

        // Extract the last digit of the number
        int digit = number % 10;

        // Add the digit raised to the power of the length to the sum
        sum += (int) Math.pow(digit, length);

        // Recursive call with the number divided by 10 (remove the last digit)
        return isArmstrongRecursive(number / 10, length, sum);
    }


}

