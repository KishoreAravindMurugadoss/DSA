package tut8_Assingments;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		System.out.println("-------------------- Odd or Even Program --------------------");
		System.out.println();
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number that you want to check: ");
		int num = s.nextInt();
		System.out.println();
		oddOrEven(num);
		s.close();
		
	}

	public static void oddOrEven(int num) {

		if (num % 2 == 0)
			System.out.println(num + " is an Even Number");
		else
			System.out.println(num + " is an Odd Number");
	}

}
