package org.example.oops.inheritance.vakul;

class GrandParent {
    void display()
    {
        System.out.println("at GrandParent display method");
    }

    void displayGrandParent()
    {
        System.out.println("at displayGrandParent display method");
    }
}

class Parent extends GrandParent {
    @Override
    void display()
    {
        System.out.println("at Parent display method");
        super.display();
    }
}

class Child extends Parent {
    void show()
    {
        System.out.println("at Child show method");
        super.display();
    }
    @Override
    void display()
    {
        System.out.println("at Child display method");
        super.display();
    }
}

public class Main
{
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        //((GrandParent)child).displayGrandParent();
    }
}
