package org.example.array;

import java.util.Arrays;

public class ArraysWithStarPatternExample1
{
    public static void main(String[] args)
    {
        String [][] array = new String[4][4];
        int arrayLength = array.length;
        for(int i = 0; i < arrayLength; i++)
        {
            for(int j =0; j < arrayLength; j++)
            {
                if(i == 0 || i == arrayLength - 1)
                {
                    array[i][j] = "x";
                }
                else if( j == 0 || j == arrayLength - 1)
                {
                    array[i][j] = "x";
                }
                else
                {
                    array[i][j] = "0";
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
        //System.out.println("arrayLength "+ Arrays.deepToString(array));
    }
}
