package org.example.array;

import java.util.Arrays;

public class SortExample1
{
    public static void main(String[] args)
    {
        int[] unsortedArray = {5,3,8,2,6};
        System.out.println("unsortedArray : "+ Arrays.toString(unsortedArray));
        int arrayLength = unsortedArray.length;
        for(int i = 0; i < arrayLength - 1; i++)
        {
            /*
                       5,3,8,2,6

                       3,5,8,2,6
                step1: 2,5,8,3,6
                       2,3,8,5,6
                step2: 2,3,8,5,6
                step3: 2,3,5,8,6
                       2,3,5,6,8

             */
            for(int j= i; j < arrayLength; j++)
            {
                 if(unsortedArray[i] > unsortedArray[j])
                 {
                     int temp = unsortedArray[i];
                     unsortedArray[i] = unsortedArray[j];
                     unsortedArray[j] = temp;
                 }
            }
            System.out.println("step  : " +(i + 1) +Arrays.toString(unsortedArray));
        }
        System.out.println("sorted : "+Arrays.toString(unsortedArray));
    }
}
