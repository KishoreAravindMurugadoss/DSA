package tut11_Assingments;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter: ");
		int num = scanner.nextInt();
		boolean bool = isOddOrEven(num);
		if (bool) 
			System.out.println("Even Number!");
		else
			System.out.println("Odd Number!");
		scanner.close();

	}

	private static boolean isOddOrEven(int num) {
		boolean bool = true;
		if (num % 2 != 0) {
			bool = false;
		}
		return bool;
	}

}
