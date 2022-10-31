/*Juan Carlos T. Matias
IT101A*/
import java.util.*;
public class Male_Female {

	public static void main(String[] args) {
		
		String newline = System.lineSeparator();
		double male, female, students, male2, female2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of males: ");
		male = s.nextDouble();
		
		System.out.print("Enter the number of females: ");
		female = s.nextDouble();
		
		students = male + female;
		System.out.printf("Number of students = %.0f", students);
		System.out.println("");
		
		male2 = male * 100 / students;
		female2 = female * 100 / students;
		
		System.out.printf("Male = %.2f", male2);
		System.out.println("");
		
		System.out.printf("Female = %.2f", female2);
		System.out.println("");
	}

}
