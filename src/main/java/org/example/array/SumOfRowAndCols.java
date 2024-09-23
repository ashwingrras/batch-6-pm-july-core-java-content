package org.example.array;

import java.util.Arrays;

public class SumOfRowAndCols
{
    public static void main(String[] args)
    {
        int[][] array = { {1,6,7}, {5,3,9} }; // [2][3]
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
                for(int k=0; k < values.length; k++)
                {
                    sumOfCols += values[k];
                }
                //System.out.println(" values[i]"+values[i]);
            }
            System.out.println("-----");
            resultArray[j] = sumOfCols;
            sumOfCols = 0;
        }
        System.out.println("resultArray: "+ Arrays.toString(resultArray));
    }
}
