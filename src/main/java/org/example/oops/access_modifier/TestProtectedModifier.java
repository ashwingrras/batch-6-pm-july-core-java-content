package org.example.oops.access_modifier;

import org.example.oops.access_modifier.test_protected.Example3;

public class TestProtectedModifier
{
    public static void main(String[] args)
    {
        SubClassExample1 subClassExample1 = new SubClassExample1();
        subClassExample1.sum(9,6);
        TestCallProtected testCallProtected = new TestCallProtected();
        testCallProtected.testCallProtected();

    }
}

class TestCallProtected extends Example3
{
    public void testCallProtected()
    {
        TestCallProtected example3 = new TestCallProtected();
        example3.testProtectedMethod();
        //Example3 example31 = new Example3();
        //example31.testProtectedMethod();
    }

}
