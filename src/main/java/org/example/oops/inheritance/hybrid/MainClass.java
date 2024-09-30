package org.example.oops.inheritance.hybrid;

public class MainClass
{
    public static void main(String[] args)
    {
        SbiBank sbiBank = new SbiBank();
        double sbiBankInterestRate = sbiBank.getInterestRate(1);
        System.out.println("sbiBankInterestRate : "+sbiBankInterestRate);
        HdfcBank hdfcBank = new HdfcBank();
        double hdfcInterestRate = hdfcBank.getInterestRate(1);
        System.out.println("hdfcInterestRate : "+hdfcInterestRate);

        TestInterface testInterface = new LoanInterest();
        testInterface.getTestDefaultMethod();

    }
}
