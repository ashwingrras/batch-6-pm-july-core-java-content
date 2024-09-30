package org.example.oops.inheritance.hybrid;

public class LoanInterest implements TestInterface
{
    int homeLoanCode = 1;
    int carLoanCode = 2;
    int educationLoanCode = 3;
     protected String getLoanType(int loanCode)
    {
        String loanType = "";
        if(loanCode == homeLoanCode)
        {
            loanType = "Home";
        }
        else if(loanCode == carLoanCode)
        {
            loanType = "Car";
        }
        else if(loanCode == educationLoanCode)
        {
            loanType = "Education";
        }
        return loanType;
    }

    @Override
    public void getLoanTermsAndConditions() {

    }


    /*@Override
    public void getTestDefaultMethod()
    {
        System.out.println(" at LoanInterest class");
        TestInterface.super.getTestDefaultMethod();
    }*/


    protected static void getTestStaticMethod()
    {
        System.out.println("at getTestStaticMethod");
    }

}
