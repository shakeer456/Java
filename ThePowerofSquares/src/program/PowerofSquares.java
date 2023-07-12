package program;

import java.util.Scanner;

public class PowerofSquares {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number:");
		int num=scan.nextInt();
		System.out.println(squareNumber(num));
	}
	public static int squareNumber(int num) {
		return num*num;
	}

}
