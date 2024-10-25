package org.example.generics.other_program;

//Generic Class
 class Box<Prerna> {
    private Prerna data;


    public void setData(Prerna data) {
        this.data = data;
    }


    public Prerna getData() {
        return data;
    }
}


public class GenericClassExample {
    public static void main(String[] args) {
        // Creating a Box for Integer values
        Box<Integer> integerBox = new Box<>();
        integerBox.setData(123);
        System.out.println("Integer value: " + integerBox.getData());

        // Creating a Box for String values
        Box<String> stringBox = new Box<>();
        stringBox.setData("Hello, Generics!");
        System.out.println("String value: " + stringBox.getData());

        // Creating a Box for Double values
        Box<Double> doubleBox = new Box<>();
        doubleBox.setData(26.98);
        System.out.println("double value: " + doubleBox.getData());
    }
}

