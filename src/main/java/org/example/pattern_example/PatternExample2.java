package org.example.pattern_example;

public class PatternExample2
{
    public static void main(String args[])
    {
        int no = 5;
        int maxCol = no * 2 - 1;
        for(int row=0; row < no; row++)
        {
            for(int col =0; col < maxCol; col++)
            {
                if(row == col)
                {
                    System.out.print("*");
                }
                else if(col == maxCol - (row + 1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
