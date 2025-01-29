package org.example.recursive;

import java.util.Arrays;

public class RecursiveSelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr, 0);  // Call the recursive Selection Sort function

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr, int index) {
        // Base case: when the index reaches the end of the array, stop recursion
        if (index >= arr.length - 1) {
            return;
        }

        // Find the minimum element in the unsorted part of the array
        int minIndex = index;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the found minimum element with the element at the current index
        int temp = arr[minIndex];
        arr[minIndex] = arr[index];
        arr[index] = temp;

        // Recursive call for the next index (i.e., next part of the array)
        selectionSort(arr, index + 1);
    }
}

