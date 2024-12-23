package org.example.oops.access_modifier.test_protected;

import org.example.oops.access_modifier.Example2;

public class Example3 extends Example2
{
    protected void testProtectedMethod()
    {
        System.out.println(" inside testProtectedMethod ");
        Example3 example2 = new Example3();
        example2.sum();
    }
}
