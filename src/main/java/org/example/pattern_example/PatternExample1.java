package org.example.pattern_example;

public class PatternExample1
{
    public static void main(String[] args)
    {
        /*

             *
             * *
             * * *
             * * * *
             * * * * *


             * * * * *
             * * * *
             * * *
             * *
             *


             * * *
             * * *
             *
             *
         */
        int no = 3;
        for(int i =0; i < 3; i++)
        {
            System.out.println("i : "+i);
            for(int j =0; j < no; j++)
            {
                System.out.println("j : "+j+", ");
                for(int k=0; k < no; k++)
                {
                    System.out.print("k : "+k+", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
