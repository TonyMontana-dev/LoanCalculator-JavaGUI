/*
 * Description: This class implements the interface LoanConstants to verify the loans based on constants as criteria.
 * The loans over 500,000$ should not be accepted, and forced to a loan at limit (500,000$)
 * While if terms requested by customer does not correspond to the constants, force the short-term loan 
 * 
 * This class will be the blueprint for business loan and personal loan
 * 
 * Name: TonyMontana-dev
 */


public abstract class Loan implements LoanConstants {
	private int loanID; // ID of the loan
	private String lastName; // Customer Last Name
	private double amountOfLoan; // Amount of the loan required
	private double interestRate; // Interest rate of the loan
	private int term; // Term based on the constants
	private String loanType; // Added variable to display the type of loan (Business, Personal)
	
	// Constructor
	public Loan(int loanID, String lastName, double amountOfLoan, int term, String loanType) {
		super();
		this.loanID = loanID;
		this.lastName = lastName;
		this.loanType = loanType;
		
		if (amountOfLoan > MAX_LOAN_AMOUNT) {
			this.amountOfLoan = MAX_LOAN_AMOUNT;
		} else {
			this.amountOfLoan = amountOfLoan;
		}
		
		if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
			this.term = term;
		} else {
			this.term = SHORT_TERM;
		}
	}
	
	// General default constructor
	public Loan() {
		super();
	}

	/**
	 * @return the loanID
	 */
	public int getLoanID() {
		return loanID;
	}

	/**
	 * @param loanID the loanID to set
	 */
	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the amountOfLoan
	 */
	public double getAmountOfLoan() {
		return amountOfLoan;
	}

	/**
	 * @param amountOfLoan the amountOfLoan to set
	 */
	public void setAmountOfLoan(double amountOfLoan) {
		this.amountOfLoan = amountOfLoan;
	}

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the term
	 */
	public int getTerm() {
		return term;
	}

	/**
	 * @param term the term to set
	 */
	public void setTerm(int term) {
		this.term = term;
	}
	
	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}

	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	// Calculating the total amount due with fees
	public double calculateFinalAmount() {
		return amountOfLoan + (amountOfLoan * interestRate);
	}
	
	// Method to display all required information related to loans
	public String toString() {
		return "--- FINAL AMOUNT ---\nThe total amount due for the loan + fees is: " + calculateFinalAmount() + " $\n\n--- SUMMARY OF LOAN ---\n\nLoan type: " + loanType 
				+ "\nLoan ID: " + loanID + "\nCustomer Last Name: " + lastName + "\nAmount Of Loan: " + amountOfLoan + "\nInterest Rate: " 
				+ interestRate * 100 + " %\nTerm selected: " + term + " year/s loan";
	}
}
