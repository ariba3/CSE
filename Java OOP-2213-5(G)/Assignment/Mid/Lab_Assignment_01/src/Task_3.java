

import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number : ");
		 n = input.nextInt();
		 input.close();
		 System.out.println("Pattern for "+n+" numbers : ");
		 for(int i=1;i<=n;i++)
         {
for(int j=1;j<=n-i;j++)
                 {
                         System.out.print(" ");
                 }

         for(int j=1;j<=i;j++)
                 {
                         System.out.print(j);
                 }
               System.out.println();
		 }
	}
}




