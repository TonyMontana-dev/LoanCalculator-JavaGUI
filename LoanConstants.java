/*
 * Description: This is an interface needed to set constants as criteria for other classes
 * 
 * In has short term, medium term, and long term loan as well as the company providing the loans and the maximum loan amount.
 * 
 * Name: TonyMontanad-dev
 */


public interface LoanConstants {
	public static final int SHORT_TERM = 1; // 1 year loan
	public static final int MEDIUM_TERM = 3; // 3 years loan
	public static final int LONG_TERM = 5; // 5 years loan
	public static final String COMPANY_NAME = "HighTech Construction Loan Company";
	public static final double MAX_LOAN_AMOUNT = 500000;
}
