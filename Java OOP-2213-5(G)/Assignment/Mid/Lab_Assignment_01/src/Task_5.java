
import java.util.Scanner;

public class Task_5 {
	public static void main(String[] args) 
	{
		int n,p,count =0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = input.nextInt();
		
		int arr[] = new int[n];
		System.out.print("Enter the "+n+" integers: ");
		for(int i=0; i<n; i++)
		{
			arr[i]= input.nextInt();
		}
		System.out.print("Enter the number to search: ");
		p = input.nextShort();
		input.close();
		for(int i=0; i<n ; i++)
		{
			if(arr[i]==p)
			{
				count++;
			}
		}
		System.out.println(p+" occurred "+count+" times in the array");
	}

}



