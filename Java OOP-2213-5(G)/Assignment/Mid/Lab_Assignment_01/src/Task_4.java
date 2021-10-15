
import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		Double x , y ;
		int operator;
		System.out.print("Enter the first number : ");
		x = input.nextDouble();
		System.out.print("Enter the second number : ");
		y = input.nextDouble();
		
		System.out.println("\n1. Addtion (+)\n"
				+ "2. Subtraction (-)\n"
				+ "3. Multiplicantion(*)\n"
				+ "4. Divition(/)");
		System.out.println("Enter operation number: ");
		operator = input.nextInt();
		input.close();
		double result;
		switch (operator) {
		case 1:
			result = x + y ;
			break;
		case 2:
			result = x - y ; 
			break;
		case 3:
			result = x*y;
			break;
		case 4:
			result = x/y;
			break;
		default:
			System.out.println("You have enter the wrong operator");
			return;
		}	
	System.out.println("The result is " +result);	
	}
}



