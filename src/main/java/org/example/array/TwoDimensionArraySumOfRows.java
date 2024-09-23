package org.example.array;

import java.util.Arrays;

public class TwoDimensionArraySumOfRows
{
    public static void main(String[] args)
    {
        int[] sumOfCols = {1,6,7};
        int sumOfColsLength = sumOfCols.length;
        int [] resultSumOfCols = new int[sumOfColsLength];
        int sumOfCol = 0;
        for(int i=0; i < sumOfColsLength; i++)
        {
            sumOfCol = sumOfCols[i];
            for(int j = i+1; j < sumOfColsLength; j++)
            {
                sumOfCol += sumOfCols[j];
            }
            resultSumOfCols[i] = sumOfCol;
            sumOfCol = 0;
        }
        System.out.println(Arrays.toString(resultSumOfCols));
        /////
        int[][] twoDSumOfCols = { {1,6,7}, {5,3} }; // [2][3]
        int twoDSumOfColsLength = twoDSumOfCols.length;
        int [][] twoDResultSumOfCols = new int[sumOfColsLength][];
        sumOfCol = 0;
        for(int i=0; i < twoDSumOfColsLength; i++ )
        {
            // at i index two d array k andar array
            int[] rowArray = twoDSumOfCols[i];
            //
            int rowArrayLength = rowArray.length;
            twoDResultSumOfCols[i] = new int[rowArrayLength];
            for(int j=0; j < rowArrayLength; j++)
            {
                sumOfCol = rowArray[j];
                for(int k = j+1; k < rowArrayLength; k++)
                {
                    sumOfCol += rowArray[k];
                }
                //resultSumOfCols[i] = sumOfCol;
                twoDResultSumOfCols[i][j] = sumOfCol;
                sumOfCol = 0;
            }
            //
        }
        System.out.println("----------------");
        System.out.println(Arrays.toString(twoDResultSumOfCols[0]));
        System.out.println(Arrays.toString(twoDResultSumOfCols[1]));
    }
}
