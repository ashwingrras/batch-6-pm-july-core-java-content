package org.example.array;

public class ArrayMaxValue
{
    public static void main(String[] args)
    {
        int[] array = {4,6,2,9,21,43,1,4,5,-16};
        int arrayLength = array.length;
        if(arrayLength > 0)
        {
            int maxValue = array[0];
            int minValue = array[0];
            for(int i =0; i < arrayLength; i++)
            {
                if(array[i] > maxValue)
                {
                    maxValue = array[i];
                }
                if(array[i] < minValue)
                {
                    minValue = array[i];
                }
            }
            System.out.println("maxValue: "+maxValue);
            System.out.println("minValue: "+minValue);
        }
        else
        {
            System.out.println("array is blank, no value found in array");
        }
    }
}
