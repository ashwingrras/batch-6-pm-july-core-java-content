package org.example.generics.other_program;

interface CalculatorNew<T> {
    T add(T num1, T num2);
    T subtract(T num1, T num2);
}

public class GenericInterfaceExampleNew<T extends Number> implements CalculatorNew<T>
{

    public static void main(String[] args)
    {
        double a = 0;
        CalculatorNew<Double> calculatorNew = new CalculatorNew<Double>() {
            @Override
            public Double add(Double num1, Double num2) {
                return num1 + num2;
            }

            @Override
            public Double subtract(Double num1, Double num2) {
                return num1 - num2;
            }
        };



        System.out.println(calculatorNew.add(1.2,4.5));
        System.out.println(calculatorNew.subtract(4.5,2.5));
    }

    @Override
    public T add(T num1, T num2)
    {
        return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
    }

    @Override
    public T subtract(T num1, T num2) {
        return null;
    }
}
