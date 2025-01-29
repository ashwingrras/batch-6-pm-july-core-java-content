package org.example.recursive;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int result = binarySearch(arr, target, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;  // Base case: element is not found
        }

        int mid = low + (high - low) / 2;

        // If the element is found
        if (arr[mid] == target) {
            return mid;
        }

        // Recursively search in the left half or right half
        if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);  // Left half
        } else {
            return binarySearch(arr, target, mid + 1, high);  // Right half
        }
    }


}

