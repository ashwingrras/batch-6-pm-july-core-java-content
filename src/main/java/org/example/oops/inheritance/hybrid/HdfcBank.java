package org.example.oops.inheritance.hybrid;

public class HdfcBank extends LoanInterest
{
    private double homeLoanInterest = 7.8;
    private double carLoanInterest = 9.7;
    public double getInterestRate(int loanCode)
    {
        String loanType = getLoanType(loanCode);
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
