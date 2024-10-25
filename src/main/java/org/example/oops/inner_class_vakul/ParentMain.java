package org.example.oops.inner_class_vakul;

interface SumOfNo
{
    int sum(int a, int b);
}

public class ParentMain
{
    public static void main(String[] args)
    {
        /*ParentVakul p = new ParentVakul();
        p.test();
        System.out.println(p.a);
        ParentVakul.Inner pi = p.new Inner();
        pi.display();*/

        // anonymous class
        SumOfNo sumOfNo = new SumOfNo() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(sumOfNo.sum(10,8));

    }
}
