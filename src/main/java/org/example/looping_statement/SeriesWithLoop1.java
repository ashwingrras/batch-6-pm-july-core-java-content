package org.example.looping_statement;

public class SeriesWithLoop1
{
    public static void main(String[] args) 
    {
        
        // Question 1.  1, 3, 4, 6, 7, 9, 10, 12, 13, 15
        // Question 2.  1, 3, 6, 10, 15, 21, 28, 36, 45, 55
        // Question 3.  1, 3, 6, 10, 15, 13, 10, 6, 1     
        // Question 4.  30, 27, 25, 22, 20, 17, 15, 12, 10, 7, 5, 2, 0
        // Question 5.  2, 4, 12, 24, 72, 144
        // Question 6.  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        int tillValue = 15;
        int add = 0;
        for (int i=0; i < tillValue; i++)
        {
            add += i % 2 == 0 ? 1 : 2;
            /*
            if (i % 2 == 0) 
            {
                add = add + 1;  // even  
            }
            else
            {
                add = add + 2; // odd
            }
            */
            if (add <= tillValue) 
            {
                System.out.println(add);     
            }
            
            if (tillValue == add)
            {
                break;    
            }
        }
    }    
}
