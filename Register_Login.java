/*Juan Carlos T. Matias
 IT101A*/

import java.util.*;

public class Register_Login {

	public static void main(String[] args) {
		
		String fname, lname, age, address, user1, user2, pass1, pass2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-=-=-=-Register-=-=-=-"); //Register Credentials
		System.out.print("First Name: ");
		fname = s.nextLine();
		
		System.out.print("Last Name: ");
		lname = s.nextLine();
		
		System.out.print("Age: ");
		age = s.nextLine();
		
		System.out.print("Address: ");
		address = s.nextLine();
		
		System.out.print("Username: ");
		user1 = s.nextLine();
		
		System.out.print("Password: ");
		pass1 = s.nextLine();
		
		System.out.println("-=-=-=-Login-=-=-=-"); //Login of Username and Password
		System.out.print("Username: ");
		user2 = s.nextLine();
		
		System.out.print("Password: ");
		pass2 = s.nextLine();
		
		
		if (user1.equals(user2) && pass1.equals(pass2)) { //Username and Password MUST match in the Register and Login section
			System.out.println("Name: " + fname + " " + lname);
			System.out.println("Age: " + age);
			System.out.println("Address: " + address);
		}
		
		else { //Wrong credentials output
			System.out.println("Login Error");			
		}
		
	}

}
