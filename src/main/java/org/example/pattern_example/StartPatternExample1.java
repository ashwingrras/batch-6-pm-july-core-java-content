package org.example.pattern_example;
public class StartPatternExample1
{
    public static void main(String[] args)
    {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        int maxRow = 4;
        for(int row = 0; row < maxRow; row++)
        {
            for(int col = 0; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        System.out.println();
        for(int row = 0; row < maxRow; row++)
        {
            for(int col = 5; col > row; col--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int row = maxRow; row > 0; row--)
        {
            for(int col = 0; col < row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int row = 0; row < maxRow; row++)
        {
            for(int col = 0; col < maxRow - row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
