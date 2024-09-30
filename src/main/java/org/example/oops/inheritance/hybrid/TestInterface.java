package org.example.oops.inheritance.hybrid;

public interface TestInterface
{
    // by default public and abstract
    void getLoanTermsAndConditions();

    private static void getTestStaticMethod()
    {
        System.out.println("at getTestStaticMethod");
    }

    default void getTestDefaultMethod()
    {
        System.out.println(" at LoanInterest interface");
        System.out.println("at getTestDefaultMethod");
    }
}
