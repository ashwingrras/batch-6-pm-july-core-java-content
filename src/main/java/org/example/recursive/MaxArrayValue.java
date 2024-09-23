package org.example.recursive;


public class MaxArrayValue
{
    public static void main(String[] args)
    {
        int a[] = {2,5,3,9,5,11,12}; //7
        System.out.println(maxValue( a,a.length-1)); // 6
    }
    static int maxValue(int[] arr,int l)
    {
        System.out.println("l : "+l +", arr[l] : "+arr[l]);
        if(l == 0)
        {
            return arr[0];
        }
        return arr[l] > maxValue(arr, --l) ? arr[l] : maxValue(arr, l);
    }
}
