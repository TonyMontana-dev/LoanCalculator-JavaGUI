/*
 * Description: This class extends class Loan in order to create a Business Loan record using Loan class arguments.
 * This class will add 1% over the prime interest rate set by the user (therefore created the variable primeInterestRate) dedicated to Businesses
 * 
 * Name: TonyMontana-dev
 */

public class BusinessLoan extends Loan {
	public BusinessLoan(int loanID, String lastName, double amountOfLoan, int term, double primeInterestRate, String loanType) {
		super(loanID, lastName, amountOfLoan, term, loanType);
		setInterestRate(primeInterestRate + 0.01); // Increasing the interest rate by 1%
	}
}
