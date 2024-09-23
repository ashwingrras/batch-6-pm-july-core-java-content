package org.example.array;

import java.util.Arrays;

public class TwoDimensionArraySumOfColumns
{
    public static void main(String[] args)
    {
        int[][] array = { {1,6,7}, {5,3,9}, {1,1,1} }; // [2][3]
        int[] resultArray = new int[3];
        int arrayLength = array.length;
        int arrayColsLength = array[0].length;
        int sumOfCols = 0;
        // 3
        // 0, 1
        for(int j=0; j < arrayColsLength; j++)
        {
            //
            for(int i=0; i < arrayLength; i++)
            {
                int[] values = array[i];
                sumOfCols += values[j];
            }
            resultArray[j] = sumOfCols;
            sumOfCols = 0;
        }
        System.out.println("resultArray: "+ Arrays.toString(resultArray));
    }
}
