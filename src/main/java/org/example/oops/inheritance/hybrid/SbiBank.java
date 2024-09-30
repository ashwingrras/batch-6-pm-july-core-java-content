package org.example.oops.inheritance.hybrid;

public class SbiBank extends LoanInterest
{
    private double homeLoanInterest = 6.7;
    private double carLoanInterest = 8.5;
    public double getInterestRate(int loanCode)
    {
        String loanType = ""; //getLoanType(loanCode);
        double interestRate = 0;
        if(loanType.equals("Home"))
        {
            interestRate = homeLoanInterest;
        }
        else if(loanType.equals("car"))
        {
            interestRate = carLoanInterest;
        }
        return interestRate;
    }
}
