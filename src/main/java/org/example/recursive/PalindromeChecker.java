package org.example.recursive;

public class PalindromeChecker
{
    public static void main(String[] args) {
        String testString = "madam";

        if (isPalindrome(testString)) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Base case: if the string has 0 or 1 character, it's a palindrome
        if (str.length() <= 1)
        {
            return true;
        }

        // Check if the first and last characters are the same
        if (str.charAt(0) != str.charAt(str.length() - 1))
        {
            return false;
        }

        // Recursively check the substring without the first and last characters
        return isPalindrome(str.substring(1, str.length() - 1));
    }


}

