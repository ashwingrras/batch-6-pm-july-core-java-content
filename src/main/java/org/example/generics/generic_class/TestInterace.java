package org.example.generics.generic_class;

public interface TestInterace
{
    int z = 5;
    default double sum()
    {
        System.out.println("inside sum method");
        return 7.6;
    }

}
