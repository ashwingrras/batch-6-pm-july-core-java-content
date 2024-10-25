package org.example.oops.inner_class_vakul;

public class ParentVakul
{
    ParentVakul()
    {
        System.out.println(" ParentVakul constructor ");
        System.out.println(" end of ParentVakul constructor ");
    }
    int a;
    public void test()
    {
        a = 10;
        // System.out.println(a);
    }

    // non-static inner class
    class Inner extends ParentVakul
    //class Inner
    {
        Inner()
        {
            System.out.println(" Inner constructor ");
        }
        public void display()
        {
            System.out.println(" inside diplay, Inner class extends ParentVakul");
            System.out.println(a);
        }
    }
}
