package org.example.recursive;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        reverseArray(arr, 0, arr.length - 1);

        System.out.println("Reversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;  // Base case: when start index is greater than or equal to end index
        }

        // Swap the elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call to reverse the subarray
        reverseArray(arr, start + 1, end - 1);
    }
}

