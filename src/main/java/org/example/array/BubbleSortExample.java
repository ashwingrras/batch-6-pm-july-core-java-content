package org.example.array;

import java.util.Arrays;

public class BubbleSortExample
{
    public static void main(String[] args)
    {
        int[] unsortedArray = {5,3,8,2,6};
        System.out.println("unsortedArray : "+ Arrays.toString(unsortedArray));
        int arrayLength = unsortedArray.length;
        // i : 0 to 4
        for (int i = 0; i <  arrayLength - 1; i++)
        {
            // j : 0 to 3
            //j : 0 to 2
            for (int j = 0; j < arrayLength - i - 1; j++)
            {
                if (unsortedArray[j] > unsortedArray[j + 1])
                {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
            //  5,3,8,2,6
            //  3,5,8,2,6
            //  3,5,2,8,6
            //  3,5,2,6, 8 // step 1
            //  3,2,5,  6,8 // step 2
            //  2,3,5,6,8 // step 3

            System.out.println("step  : " +(i + 1) +Arrays.toString(unsortedArray));
        }
        System.out.println("sorted : "+Arrays.toString(unsortedArray));
    }
}
