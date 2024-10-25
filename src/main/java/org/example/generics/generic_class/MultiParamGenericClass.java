package org.example.generics.generic_class;

public class MultiParamGenericClass<T,V>
{

    MultiParamGenericClass()
    {
        System.out.println(" inside MultiParamGenericClass ");
    }

    public T a;
    public V b;

    public void setKeyValue(T a, V b)
    {
        this.a = a;
        this.b = b;
    }

    public Object getKey()
    {
        return a;
    }

    public Object getValue()
    {
        return b;
    }


}
