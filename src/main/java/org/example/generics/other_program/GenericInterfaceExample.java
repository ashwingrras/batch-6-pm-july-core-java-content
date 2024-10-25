package org.example.generics.other_program;

interface MyGenericInterface<T> {
    T getValue();
    void setValue(T value);
}

interface MyGenericInterfaceSecond<T> {
    T getValueSecond();
    void setValueSecond(T value);
}
class MyStringContainer implements MyGenericInterface<String>, MyGenericInterfaceSecond<Double> {

    private String strValue;

    @Override
    public String getValue() {

        return strValue;
    }

    @Override
    public void setValue(String value) {

    }

    @Override
    public Double getValueSecond() {
        return 0.0;
    }

    @Override
    public void setValueSecond(Double value) {

    }
}


public class GenericInterfaceExample
{
    public static void main(String[] args) {
        MyStringContainer container = new MyStringContainer();
        container.setValue("123");


        System.out.println("Value: " + container.getValue());
    }
}

