package org.example.generics.generic_interface;

public class TestClass implements  TestInterface<String>
{


    @Override
    public String sum(String a, String b) {
        return a + b;
    }
}
