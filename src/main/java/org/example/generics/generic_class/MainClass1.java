package org.example.generics.generic_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainClass1
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("vakul");

        PrintValue<Integer> printValue = new PrintValue<>();
        printValue.setA(18);
        System.out.println(printValue.getA());
        printValue.setData(14);
        System.out.println(printValue.getData());

        PrintValue<String> printValue1 = new PrintValue<>();
        printValue1.setData("10");
        System.out.println(printValue1.getData());

        PrintValue<Object> printValue2 = new PrintValue<>();

        printValue2.setData(new int[]{1,2,3});
        Class ofArray = printValue2.getData().getClass().getComponentType();
        System.out.println(ofArray);
        System.out.println(printValue2.getData());
        int[] arr = (int[]) printValue2.getData();
        System.out.println(Arrays.toString(arr));

        PrintValue<String> printValue3 = new PrintValue<>();
        printValue3.data = "10";
        System.out.println(printValue3.data);


        MultiParamGenericClass<String , String> multiParamGenericClass1 = new MultiParamGenericClass<>();
        multiParamGenericClass1.setKeyValue("1001","vakul");
        System.out.println(multiParamGenericClass1.getKey());
        System.out.println(multiParamGenericClass1.getValue());
        /*System.out.println(getIntValue(14));
        System.out.println(getIntValue("14"));
        System.out.println(getIntValue(18.60));*/
        Integer[] integers = new Integer[3];
        System.out.println(Arrays.toString(getArray(new String[] {"1","2"})));
        System.out.println(Arrays.toString(getArray(integers)));

        ArrayList<Student> arrayList1 = new ArrayList<>();
        Student student1 = new Student(1001, "vakul");
        arrayList1.add(student1);
        student1 =  new Student(1002, "ashish");
        arrayList1.add(student1);
        Integer[] integers1 = new Integer[4];
        integers1[0] = 10;
        integers1[1] = 15;
        integers1[2] = 13;
        integers1[3] = 17;
        String name = "10";
        if(name.equals(10))
        {
            System.out.println(" inside if ");
        }
        else
        {
            System.out.println(" inside else ");
        }
        System.out.println(findFirst(integers1, "15"));

        //System.out.println(sum(7,7));

        System.out.println(findMax(integers1));
        String[] strArray = {"a","123","1"};
        System.out.println(findMax(strArray));
        System.out.println(" calling testVakul");
        try
        {
            Integer a = testVakul();
            System.out.println("a = "+a);
        }
        catch (Exception e)
        {

        }

        System.out.println(" end of main method ");
    }

    public static <T> T getFirstElement(T[] array)
    {
        return array[0];
    }

    public static <T> T getIntValue(Object a)
    {
        System.out.println(a);
        System.out.println(a.toString());
        return (T)a;
    }


    public static <T> T testVakul()
    {
        return (T)(Integer)1;
    }

    public static <T> T[] getArray(T[] a)
    {
        return a;
    }

    public static <T> int getIntValue2(T a)
    {
        return (int) a;
    }

    public static <T> int findFirst(T[] array, T target) {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends TestInterace> double testMethod1(Integer a)
    {
        return a;
    }


    public static <T> int sum(T num1, T num2)
    {
        Double dd = (double) num1;
        System.out.println(dd);
        Double num_1 = (Double) num1;
        Double num_2 = (Double) num2;
        double sum = num_1 + num_2;
        System.out.println("sum = "+sum);
        return (int)sum;
    }

    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0)
            return null;

        T max = array[1];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }


}
