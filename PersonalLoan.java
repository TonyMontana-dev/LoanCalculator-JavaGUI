/*
 * Description: This class extends class Loan in order to create a Personal Loan record using Loan class arguments.
 * This class will add 2% over the prime interest rate set by the user (therefore created the variable primeInterestRate) dedicated to Individuals
 * 
 * Name: TonyMontana-dev
 */

public class PersonalLoan extends Loan {
	public PersonalLoan(int loanID, String lastName, double amountOfLoan, int term, double primeInterestRate, String loanType) {
		super(loanID, lastName, amountOfLoan, term, loanType);
		setInterestRate(primeInterestRate + 0.02); // Increasing the interest rate by 2%
	}
	
}
