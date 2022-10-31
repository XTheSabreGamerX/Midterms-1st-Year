/*Juan Carlos T. Matias
IT101A*/ 
import java.util.*;
public class Attack_Speed {

	public static void main(String[] args) {
		
		double base, bonus, level, current;
		
		Scanner s = new Scanner(System.in);	
		
		System.out.print("Enter the base attack speed: ");
		base = s.nextDouble();
		System.out.print("Enter the bonus attack speed: ");		//Input of the Base and Bonus Attack Speed, and the Level
		bonus = s.nextDouble();
		System.out.print("Enter the level: ");
		level = s.nextDouble();
		
		current = base*(1+(bonus*(level-1)));	//Calculation of the Current Attack Speed
		
		System.out.printf("The character's current attack speed is %.3f", current);		//Output of the Current Attack Speed

	}

}
