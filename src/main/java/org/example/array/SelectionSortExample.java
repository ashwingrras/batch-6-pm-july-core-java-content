package org.example.array;

import java.util.Arrays;

public class SelectionSortExample
{
    public static void main(String[] args)
    {
        int[] unsortedArray = {12,10,16,11,9,7};
        System.out.println("unsortedArray : "+ Arrays.toString(unsortedArray));
        int arrayLength = unsortedArray.length;
        for(int i=0; i < arrayLength - 1; i++)
        {
            int minIndex = i; // 0
            int minValue = unsortedArray[i];
            for(int j = i+1; j < arrayLength; j++)
            {
                if(unsortedArray[minIndex] > unsortedArray[j])
                {
                    minIndex = j;
                    minValue = unsortedArray[j];
                }
            }
            //
            int temp = unsortedArray[minIndex];
            unsortedArray[minIndex] = unsortedArray[i];
            unsortedArray[i] = temp;
            System.out.println("minIndex: "+minIndex);
            System.out.println("step  : " +(i + 1) +Arrays.toString(unsortedArray));
        }
        //System.out.println("sorted : "+Arrays.toString(unsortedArray));
    }
}
