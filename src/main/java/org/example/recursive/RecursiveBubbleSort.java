package org.example.recursive;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr, arr.length);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr, int n) {
        // Base case: if the array size is 1 or less, it's already sorted
        if (n == 1) {
            return;
        }
        // Perform a single pass of Bubble Sort, "bubble" the largest element to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap the elements if they are in the wrong order
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursively call the function for the remaining elements
        bubbleSort(arr, n - 1);
    }
}

