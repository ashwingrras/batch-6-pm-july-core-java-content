package org.example.generics.generic_class;

// generic class
public class PrintValue<T>
{
    void printValue()
    {
        System.out.println(" inside print value");
    }

    int sumValue(int a, int b)
    {
        return  a + b;
    }

    int a;

    // generic variable
    public T data;

    T b;
    T c;
    T d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    // generic method
    public T getData()
    {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
