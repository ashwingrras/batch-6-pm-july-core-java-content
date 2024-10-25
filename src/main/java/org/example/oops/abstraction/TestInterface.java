package org.example.oops.abstraction;

public interface TestInterface
{
    int b = (int) 10;
    // constant
    int a = 10;
    /*default void show()
    {
        System.out.println("at TestInterface show method");
    }*/

    int sumOfTwo(int a, int b); // public and abstract implicitly
    int sumOfTwo(int a, int b, int c); // public and abstract implicitly

}
