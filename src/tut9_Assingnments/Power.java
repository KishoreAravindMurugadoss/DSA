package tut9_Assingnments;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		System.out.println("---------- Power Calculator ----------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter base: ");
		double base = scanner.nextDouble();
		System.out.print("to the power of ");
		int power = scanner.nextInt();
		double result = powerOf(base, power);
		System.out.print(base + " to the power of " + power + " is " + result);
		scanner.close();

	}

	private static double powerOf(double base, int power) {
		double result = 1;
		for (int i = 1; i <= power; i++) {
			result  *= base; 
		}
		return result;
	}

}
