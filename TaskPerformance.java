/*Juan Carlos T. Matias
IT101A*/
import java.util.*;
public class TaskPerformance {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String fname, lname, add;
		int pin, pin2;
		double depfee;
		
		System.out.println("==================================================");
		System.out.println("           Welcome to Banking System");
		System.out.println("--------------------------------------------------");		
		System.out.println("");		
		System.out.println("==================================================");
		System.out.println("                Create Account");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		
		System.out.print("Firstname          : ");
		fname = s.nextLine();
		
		System.out.print("Lastname           : ");
		lname = s.nextLine();
		
		System.out.print("Address            : ");		//Account Register Input
		add = s.nextLine();
		
		System.out.print("Deposit Fee        : ");
		depfee = s.nextDouble();
		
		System.out.print("PIN Code           : ");
		pin = s.nextInt();
		
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("                Account Information");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		System.out.println("Account Balance   | " + depfee);
		System.out.println("Fullname          | " + fname + " " + lname);		//Account Information Display
		System.out.println("Address           | " + add);
		System.out.println();		
		System.out.println("==================================================");
		System.out.println("                PIN CODE Security");
		System.out.println("==================================================");
		System.out.println("");
		
		System.out.print("Enter your PIN Code: ");		//PIN CODE Verification (Must be the same as Registered PIN)
		pin2 = s.nextInt();
		
		System.out.println("Verifying identity....");
		System.out.println("");
		
			if (pin2==pin) {
				System.out.println("PIN Verified!");
				System.out.println("");
				System.out.println("==================================================");
				System.out.println("                Welcome to the Bank");
				System.out.println("==================================================");
				System.out.println("");
				
				double inrate, depamt, bal;
				
				System.out.print("Enter Interest Rate: ");				//Successful PIN Login
				inrate = s.nextDouble();
				
				System.out.print("Enter Deposit amount: ");
				depamt = s.nextDouble();
				
				bal = (((depamt * inrate) + depfee) + depamt);
				
				System.out.println("");
				System.out.println("==================================================");
				System.out.println("Account Balance   | " + bal);
				System.out.println("Fullname          | " + fname + " " + lname);
				System.out.println("Address           | " + add);
				System.out.println("==================================================");
				System.out.println("");
				
				char action;
				
				System.out.println("Press [D] if you want to deposit.");
				System.out.println("Press [W] if you want to withdraw.");			//Deposit or Withdraw Question
				System.out.println("Press [Any] key to exit the transaction.");
				System.out.println("");
				
				System.out.print("Enter the key: ");
				action = s.next().charAt(0);
				System.out.println("");
				
				double depamt2, withamt;
				int base = 0;
				
					if (action == 'D') { 	//Deposit Code Section
						
						System.out.println("New Deposit");
						System.out.println("==================================================");
						System.out.println("");
						System.out.print("Enter Deposit amount: ");
						depamt2 = s.nextDouble();	
						System.out.println("==================================================");
						System.out.println("");
							
							if (depamt2 < base) {		//The Deposit Amount 2 is lower than the base amount
								System.out.println("Invalid amount");
							}
							
							else {		//Successful Deposit Amount 2
								
								double depamt3 = (((depamt2 * inrate) + bal) + depamt2);
								
								System.out.println("--------------------------------------------------");
								System.out.println("Account Balance   | " + depamt3);
								System.out.println("Fullname          | " + fname + " " + lname);
								System.out.println("Address           | " + add);
								System.out.println("--------------------------------------------------");
								
								System.out.println("Press any key to exit...");
								
							}
					
					}
				
					else if (action == 'W') {		//Withdraw Code Section
						
							System.out.println("Withdrawal");
							System.out.println("==================================================");
						
							System.out.print("Enter Withdrawal amount: ");
							withamt = s.nextDouble();	
							System.out.println("==================================================");
							
								if (withamt > bal) {		//Withdrawal amount is higher than the balance
									System.out.println("--------------------------------------------------");
									System.out.println("Insufficient Balance. Please Try Again. . . ");
									System.out.println("--------------------------------------------------");
									
									System.out.println("Press any key to exit...");
								}
								
								else {		//Proper Withdrawal amount
									
									double bal2 = (bal - withamt);	//Withdrawal deduction
									
									System.out.println("==================================================");		//Account info with deduced amount
									System.out.println("Account Balance   | " + bal2);
									System.out.println("Fullname          | " + fname + " " + lname);
									System.out.println("Address           | " + add);
									System.out.println("==================================================");
									System.out.println("");
									
									System.out.println("Your new balance is " + bal2);									
									System.out.println("Press any key to exit...");
								}
							
							
					}
				
					else {
								System.out.println("You cancel your transaction. THANK YOU!. .");
					}
				
				
			}
			
			else {
				System.out.println("Your PIN code is incorrect");			//Failed PIN Login
				System.out.println("Please create an account and try again. Thanks!");
				
			}
		
		
		
	}
}