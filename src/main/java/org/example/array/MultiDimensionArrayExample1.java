package org.example.array;

import java.util.Arrays;

public class MultiDimensionArrayExample1
{
    public static void main(String[] args)
    {
        int[] values = new int[2];
        System.out.println(Arrays.toString(values));
        values[0] = 4;
        values[1] = 5;
        System.out.println(Arrays.toString(values));
        int[][] rowsCols = new int[2][3];
        System.out.println(Arrays.toString(rowsCols[0]));
        System.out.println(Arrays.toString(rowsCols[1]));
        rowsCols[0][0] = 10;
        rowsCols[0][1] = 20;
        rowsCols[0][2] = 30;
        rowsCols[1][0] = 100;
        rowsCols[1][1] = 200;
        rowsCols[1][2] = 300;
        System.out.println(Arrays.toString(rowsCols[0]));
        System.out.println(Arrays.toString(rowsCols[1]));


        // jagged array
        int[][] rowsCols2 = { {1,2,3}, {4,5} };
        System.out.println(Arrays.toString(rowsCols2[0]));
        System.out.println(Arrays.toString(rowsCols2[1]));

        int[][] multiArray1  = new int[4][];
        multiArray1[0] = new int[3];
        multiArray1[1] = new int[4];
        multiArray1[2] = new int[2];
        multiArray1[3] = new int[10];
        for(int i=0; i < multiArray1.length; i++)
        {
            //System.out.println(Arrays.toString(multiArray1[i]));
            System.out.println("at row "+(i+1));
            for(int j=0; j < multiArray1[i].length; j++)
            {
                System.out.println(multiArray1[i][j]);
            }
        }
        int[][][] threeDArray = new int[2][2][2];
    }
}
