package org.example.other_logical_questions;

public class ReverseInteger {
    public static void main(String[] args)
    {

        int number = 1534236469;
        //int numberReverse = 9646324351;
        int reversedNumber = reverseInteger(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
        long reversedBigNumber = reverseBigInteger(number);
        System.out.println("reversed BigNumber: " + reversedBigNumber);
        int reversedSolution = reverseIntegerSolution(number);
        System.out.println("reversedSolution: " + reversedSolution);
    }

    public static int reverseInteger(int n)
    {
        System.out.println("at reverseInteger method");
        long reversed = 0;
        while(n != 0)
        {
            long digit = n % 10;
            reversed = reversed * 10;
            reversed +=  digit;
            n /= 10;
        }
        try
        {
            return Math.toIntExact(reversed);
        }
        catch (Exception e)
        {
            return 0;
        }

    }

    public static long reverseBigInteger(int n)
    {
        long reversed = 0;
        while(n != 0)
        {
            long digit = n % 10;
            reversed = reversed * 10;
            reversed +=  digit;
            n /= 10;
        }
        System.out.println("revLong: "+reversed);
        int revInt = (int)reversed;
        System.out.println("revInt: "+revInt);
        //Long value: 9646324351
        //Int value: -161051
        /*
            This happens because 9646324351 exceeds the maximum
            value for an int, so it wraps around, and the result
            is effectively the remainder when divided by 2^32
            (the number of distinct values an int can represent).
         */
        return reversed;
    }

    public static int reverseIntegerSolution(int number) {
        System.out.println("at reverseIntegerSolution");
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            // Check for overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7))
            {
                //throw new ArithmeticException("Overflow occurred");
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8))
            {
                //throw new ArithmeticException("Overflow occurred");
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

}
