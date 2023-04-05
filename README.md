# LoanCalculator Java GUI application
This is the main class that drives the rest of the classes. Here we will create an array list based on the user input.
The program provides a menu with various options in order to give maximum flexibility to the user or the employee of the company to enter all the required information for different types of loans all at once.

# Classes used in this program
In order to use the following program you will need to create the following classes:
+ BusinessLoan
+ PersonalLoan
+ Loan
+ LoanConstants (interface)

This classes are required as per the given assignment:
(Construction Loan Company Interface: Polymorphism)
HighTech Construction Loan Company makes loans of up to $500,000 for construction projects. There are two categories of Loans —those to businesses and those to individual applicants. 
Write an application that tracks all new construction loans. The application must also calculate the total amount owed at the due date (original loan amount + loan fee). 

The application should include the following classes:  
+ Loan | A public abstract class that implements the LoanConstants interface. A Loan includes a loan number, customer's last name, amount of loan, interest rate, and term. The constructor requires data for each of the fields except interest rate. Do not allow loan amounts over $500,000. Force any loan term that is not one of the three defined in the LoanConstants class to a short-term, 1-year loan. Create a toString() method that displays all the loan data.  
+ LoanConstants | A public interface class. LoanConstants includes constant values for short-term (1 year), medium-term (3 years), and long-term (5 years) loans. It also contains constants for the company name and the maximum loan amount.
+ BusinessLoan | A public class that extends Loan. The BusinessLoan constructor sets the interest rate to 1 percent over the current prime interest rate.
+ PersonalLoan | A public class that extends Loan. The PersonalLoan constructor sets the interest rate to 2 percent over the current prime interest rate.
+ CreateLoans | An application that creates an array of five Loans. Prompt the user for the current prime interest rate. Then, in a loop, prompt the user for a loan type and all relevant information for that loan. Store the created Loan objects in the array. When data entry is complete, display all the loans.

Note: This description was given for a normal application without the implementation of GUI features. However, that after creating the following assignment, I was required to convert it into using GUI features.

# How to use it
I decided to use the Swing library for a simple reasons. Since it is a program for beginners (which I am), I wanted to keep things simple and basic, therefore JavaFX for some can be challenging to setup properly. While Swing luckily is built-in with Java SDK package hence easy to setup and run. I would advise using either EclipseIDE or VSCode IDE (but not limited to).

Run the program driver called: CreateLoanGUI.java
Once you have ran it, you will be able to navigate through the menu and save your loans, as well as display them into a scrollable text area.

Let me know if you encounter issues, or if you have any suggestion to improve in any way this program!