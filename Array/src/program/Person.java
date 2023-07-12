package program;

import java.util.Scanner;

public class Person {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the persons count: ");
			int n=scan.nextInt();
			 
			Boolean arr[]=new Boolean[n];
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Is Person"+i+" "+"married? ");
				arr[i]=scan.nextBoolean();
			}
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Person"+" "+i+" "+"married"+" "+arr[i]);
			}
	}

}
