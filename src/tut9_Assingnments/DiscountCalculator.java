package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		System.out.println("---------- Discount Calculator ----------");
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the Selling Price: ");
			double sellingPrice = scanner.nextDouble();
			System.out.print("Enter the Discount Percentage (%): ");
			double discountPercentage = scanner.nextDouble();
			calculateDiscountedAmount(sellingPrice, discountPercentage);
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please Enter only numbers. ");
		} finally {
			scanner.close();
		}

	}

	private static void calculateDiscountedAmount(double sellingPrice, double discountPercentage) {

		double discountedAmount = sellingPrice * ((100 - discountPercentage) / 100);
		System.out.println("Discounted Price: " + discountedAmount);
	}

	

}
