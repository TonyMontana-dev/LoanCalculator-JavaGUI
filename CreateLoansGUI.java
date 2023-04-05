/*
 * Description of the program: This is the main class that drives the rest of the classes. Here we will create an array list based on the user input.
 * The program provides a menu with various options in order to give maximum flexibility to the user or the employee of the company to enter all the required information
 * for different types of loans all at once.
 * 
 * Updates implemented in the program: This program is a re-elaboration of a previous assignment, and it has been updated to have a graphical user interface implemented
 * The entire program runs on GUI features, and does not need the need of any terminal/console.
 * 
 * Name: TonyMontana-dev
 */

import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CreateLoansGUI {

    public static void main(String[] args) {
    	
    	// Creating an array to store all loans
    	ArrayList<Object> loans = new ArrayList<>();
        
        // Create radio buttons
        JRadioButton radioButton1 = new JRadioButton("Personal Loan");
        JRadioButton radioButton2 = new JRadioButton("Business Loan");
        JRadioButton radioButton3 = new JRadioButton("Change prime interest rate");
        JRadioButton radioButton4 = new JRadioButton("Display all registered loans");
        
        // Radio button for loan term selection
        JRadioButton shortTerm = new JRadioButton("Short term (1 year)");
        JRadioButton mediumTerm = new JRadioButton("Medium term (3 year)");
        JRadioButton longTerm = new JRadioButton("Long term (5 year)");

        // Add radio buttons to a ButtonGroup
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        
        // Radio button for loan term ButtonGroup
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(shortTerm);
        buttonGroup2.add(mediumTerm);
        buttonGroup2.add(longTerm);
        
        // Create panel to hold the radio buttons
        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(radioButton4);
        
        // Create another panel to hold the radio buttons for the selection of the loan term
        JPanel panel2 = new JPanel();
        panel2.add(shortTerm);
        panel2.add(mediumTerm);
        panel2.add(longTerm);
        
        // Introduction Part
		String name = JOptionPane.showInputDialog(null, "Welcome to the Construction Loan Company Register!\nPlease enter your name: ");
		String outputString = "Hello " + name + "\nHere you will be able to register loans into two type (business or loan)."
				+ "\nBased on a menu you can choose which type of loan and continue by completing the required fields in order to calculat the final amount.";
		
		// Display the Introduction
		JOptionPane.showMessageDialog(null, outputString, "Welcome to the LoanCalculator", JOptionPane.INFORMATION_MESSAGE);
        
        // Show dialog box to get user input
        int choice = JOptionPane.OK_OPTION;
        
        // Set the prime interest rate prior to the creation of any account in order to have a default value
    	String primeInterest = JOptionPane.showInputDialog(null, "Enter the prime interest rate: ");
    	double primeInterestRate = Double.parseDouble(primeInterest); // Convert the string into a double value and store into a variable
        
        while (choice != JOptionPane.CANCEL_OPTION) {
            int result = JOptionPane.showConfirmDialog(null, panel, "Select an option", JOptionPane.OK_CANCEL_OPTION);
        	// Handle user input based on selection of the radio button
            if (result == JOptionPane.OK_OPTION) {
                String selectedOption = "";
                if (radioButton1.isSelected()) {
                    selectedOption = "Personal Loan";
                } else if (radioButton2.isSelected()) {
                    selectedOption = "Business Loan";
                } else if (radioButton3.isSelected()) {
                    selectedOption = "Change prime interest rate";
                } else if (radioButton4.isSelected()) {
                	selectedOption = "Display output";
                }
                
                // If the selection is for a personal loan, proceed with the record of the user input and create required object to add into the array
                if (selectedOption == "Personal Loan") {
    				String loanIDStr = JOptionPane.showInputDialog(null, "Please enter the loan ID: ");
    				int loanID = Integer.parseInt(loanIDStr);
    				String lastName = JOptionPane.showInputDialog(null, "Enter last name: ");
    				String amountOfLoanStr = JOptionPane.showInputDialog(null, "Enter the amount of the loan required: ");
    				double amountOfLoan = Double.parseDouble(amountOfLoanStr);
    				// Show the second panel to give the user the selection of the required loan term
    				JOptionPane.showConfirmDialog(null, panel2, "Select a loan term", JOptionPane.OK_CANCEL_OPTION);
    				int term = 0; // Initialize the variable
    				
    				// Check which radio button was selected and based on selection set the term to a correspondent value
    				if (shortTerm.isSelected()) {
    					term = 1;
    				} else if (mediumTerm.isSelected()) {
    					term = 3;
    				} else if (longTerm.isSelected()) {
    					term = 5;
    				}
    				
    				// Create the message dialog box to let know the user that the profile was create with success!
                    JOptionPane.showMessageDialog(null, "Thank you for starting a " + selectedOption + " loan with us!");
    				String loanType = "Personal";
    				// Create the base for the object and use the variable value to set the phone number and duration
    				PersonalLoan personalLoan = new PersonalLoan(loanID, lastName, amountOfLoan, term, primeInterestRate, loanType);
    				loans.add(personalLoan); // Add personalLoan class created inside the arrayList 
                }
                
                // If the selection is for a business loan, proceed with the record of the user input and create required object to add into the array
                else if (selectedOption == "Business Loan") {
    				String loanIDStr = JOptionPane.showInputDialog(null, "Please enter the loan ID: ");
    				int loanID = Integer.parseInt(loanIDStr);
    				String lastName = JOptionPane.showInputDialog(null, "Enter last name: ");
    				String amountOfLoanStr = JOptionPane.showInputDialog(null, "Enter the amount of the loan required: ");
    				double amountOfLoan = Double.parseDouble(amountOfLoanStr);
    				// Show the second panel to give the user the selection of the required loan term
    				JOptionPane.showConfirmDialog(null, panel2, "Select a loan term", JOptionPane.OK_CANCEL_OPTION);
    				int term = 0; // Initialize the variable
    				
    				// Check which radio button was selected and based on selection set the term to a correspondent value
    				if (shortTerm.isSelected()) {
    					term = 1;
    				} else if (mediumTerm.isSelected()) {
    					term = 3;
    				} else if (longTerm.isSelected()) {
    					term = 5;
    				}
    				
    				// Create the message dialog box to let know the user that the profile was create with success!
                    JOptionPane.showMessageDialog(null, "Thank you for starting a " + selectedOption + " loan with us!");
    				String loanType = "Business";
    				// Create the base for the object and use the variable value to set the parameters
    				BusinessLoan businessLoan = new BusinessLoan(loanID, lastName, amountOfLoan, term, primeInterestRate, loanType);
    				loans.add(businessLoan); // Add businessLoan class created, inside the arrayList
                }
                
                // If the selection is to change the prime interest rate, you will prompt to set a new rate
                else if (selectedOption == "Change prime interest rate") {
                	// Ask the user to enter a new prime interest rate
                	primeInterest = JOptionPane.showInputDialog(null, "Enter the new prime interest rate: ");
                	primeInterestRate = Double.parseDouble(primeInterest);
                }
                
                // If the selection is to display the output, the program will create a scrollable text area with the all the elements of the array
                else if (selectedOption == "Display output") {
    				String message = "--- " + LoanConstants.COMPANY_NAME + " Archive ---";
    				
    				// In order to display all data inside an ArrayList, use a for loop based on the arrayList size and you will need to retrieve iteratively all the indexed objects
    				for (int i = 0; i < loans.size(); i++) {
    					message += "\n-------------------------\n" + loans.get(i).toString();
    				}
    				
    				// Create JTextArea in order to generate a scrollPane to display all the elements of the array
    				JTextArea textArea = new JTextArea(20, 40); // Set rows and columns for the text area
    				textArea.setEditable(false); // Make the text area read-only
    				textArea.setText(message); // Set the message to be displayed
    				JScrollPane scrollPane = new JScrollPane(textArea); // Create a scroll pane and add the text area to it
    				scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Set the scroll bar policy to always show
    				JOptionPane.showMessageDialog(null, scrollPane); // Show the message dialog with the scrollable text area
                }
            }
            // Configure the cancel button to close the entire program
            else if (result == JOptionPane.CANCEL_OPTION) {
            	System.exit(0);
            }
        }
        

    }
}
