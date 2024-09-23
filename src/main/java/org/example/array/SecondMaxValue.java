package org.example.array;

public class SecondMaxValue
{
    public static void main(String[] args)
    {
        int[] array = {6666,6666,-1,22,7777,7777,7777,-1}; //{8,-2,8,8,4,8};
        int arrayLength = array.length;
        if(arrayLength > 0)
        {
            int value;
            int max = array[0];
            int secondMax = array[0];
            /*
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            */
            for(int i = 0; i < arrayLength; i++)
            {
                value = array[i];
                if(value > max)
                {
                    secondMax = max;
                    max = value;
                }
                else if(value > secondMax && value != max)
                {
                    secondMax = value;
                }
                else if(max == secondMax)
                {
                    secondMax = value;
                }
            }
            System.out.println("max: "+max+", second max: "+secondMax);
        }
    }
}
