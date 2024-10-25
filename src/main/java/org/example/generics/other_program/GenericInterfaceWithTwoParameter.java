package org.example.generics.other_program;

interface Pair<FirstDT, SecondDT, ThirdDT> {
    FirstDT getFirst();
    SecondDT getSecond();
    void setFirst(FirstDT first);
    void setSecond(SecondDT second);
}
class OrderedPair<FirstDT, SecondDT, ThirdDT> implements Pair<FirstDT, SecondDT, ThirdDT> {
    private FirstDT first;
    private SecondDT second;

    private ThirdDT third;
    // Constructor
    public OrderedPair(FirstDT first, SecondDT second, ThirdDT third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    // Getter and setter methods
    public FirstDT getFirst() {
        return first;
    }
    public void setFirst(FirstDT first) {
        this.first = first;
    }
    public SecondDT getSecond() {
        return second;
    }
    public void setSecond(SecondDT second) {
        this.second = second;
    }
}


public class GenericInterfaceWithTwoParameter {
    public static void main(String[] args) {
        OrderedPair<Integer, String, String> pair = new OrderedPair<>(10, "Hello","");
        OrderedPair<String, Integer, Double> pairTwo = new OrderedPair<>("Hello",10, 5.0);
        OrderedPair<Double, Integer, String> pairThree = new OrderedPair<>(16.9,10, "");
        // Accessing elements
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());



        // Modifying elements
        pair.setFirst(20);
        pair.setSecond("World");


        // Accessing modified elements
        System.out.println("Modified First: " + pair.getFirst());
        System.out.println("Modified Second: " + pair.getSecond());
    }
}

