package org.example.generics.other_program;

// First generic interface
interface Converter2<T1, T2> {
    T2 convert(T1 input);
}

// Second generic interface
interface Calculator<T> {
    T add(T num1, T num2);
    T subtract(T num1, T num2);
}

// Class implementing both interfaces
class MathOperation<T extends Number> implements Converter2<String, T>, Calculator<T> {

    @Override
    public T convert(String input) {
        return (T) Double.valueOf(input); // Convert string to a number
    }

    @Override
    public T add(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }

    @Override
    public T subtract(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }
}

public class GenericInterfaceMultiExample2 {
    public static void main(String[] args) {
        MathOperation<Double> mathOperation = new MathOperation<>();

        // Implementing Converter interface
        System.out.println("Conversion result: " + mathOperation.convert("3.14"));

        // Implementing Calculator interface
        System.out.println("Addition result: " + mathOperation.add(5.5, 2.0));
        System.out.println("Subtraction result: " + mathOperation.subtract(10.5, 4.7));
    }
}

