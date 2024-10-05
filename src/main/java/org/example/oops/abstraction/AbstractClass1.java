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

/*
    Abstraction:
    1. abstract class : 0 to 100 % abstraction
        1. abstract method : method signature not body
            access modifier as : public, default, protected
        2. normal method
    2. interface


 */

abstract class AbstractClass1
{

    protected abstract boolean startPayment(int id, String mobileNo, double amount);

    // abstract method
     protected abstract int sum(int a, int b);

    // abstract method
    public abstract int multiply(int a, int b);

}

class NormalClass extends AbstractClass1
{
    @Override
    protected boolean startPayment(int id, String mobileNo, double amount)
    {
        System.out.println(" at startPayment, NormalClass");
        boolean paymentStatus = false;
        if(mobileNo.length() == 10)
        {
            paymentStatus = true;
        }
        return paymentStatus;
    }

    @Override
    protected int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
