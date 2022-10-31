/*Juan Carlos T. Matias
IT101A*/ 
public class Monthly_Pay {

	public static void main(String[] args) {		
		
		String name;
		double gross;
		
		name = "Juan Carlos Matias";
		gross = 25000.0;
		
		System.out.format("%-25s %-8s %-1s", "Employee name: ", name, "\n");
		System.out.format("%-25s %-8s %-1s", "Gross Pay: ", gross, "\n");			//Employee Name and Gross Pay
		System.out.println("________________________________________________");
		
		System.out.format("%-25s %-8s %-1s", "Deductions ", "Amount", "\n");
		System.out.format("%-25s %-8s %-1s", "Witholding Tax: ", gross*.15, "\n");
		System.out.format("%-25s %-8s %-1s", "SSS Contribution: ", gross*.0363, "\n");	//Calculations
		System.out.format("%-25s %-8s %-1s", "Medicare: ", gross*.0125, "\n");
		System.out.format("%-25s %-8s %-1s", "Pagibig Contribution: ", "100.0", "\n");
		
		System.out.println("________________________________________________");

		System.out.format("%-25s %-8s %-1s", "Net Pay: ", "19930.0", "\n");			//After Deductions
	}

}
