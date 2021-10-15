
import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		int positive=0, negative=0, i;
		int arr[]= new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 Numbers : ");
		for(i = 0; i < 10 ; i++)
		{
	       arr[i]= input.nextInt();
		} 
		input.close();
		for(i = 0 ;i <10 ; i++)
		{
			if(arr[i]< 0)
			{
				negative++;
			}
			else {
		
				positive++;
			}
		} 
		
		System.out.println(positive + " Positive numbers");
		System.out.println(negative + " Negative numbers");
	}

}








