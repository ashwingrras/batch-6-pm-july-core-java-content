package org.example.oops.abstraction;

/*

    // sdf
    phonepe.initPayment(100,id,pass)
    Abstraction: hide karna
    1. Abstract Class : abstraction from ( 0 to 100 % )
        normal method
        abstract method : without body, can define only
    2. Interface : abstraction 100 %


    inheritance:  extends

 */

import java.util.Scanner;

  abstract class AbstractClass1
{

    // abstract method
     protected abstract int sum(int a, int b);

    // abstract method
    public abstract int multiply(int a, int b);

}

class NormalClass extends AbstractClass1
{

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
