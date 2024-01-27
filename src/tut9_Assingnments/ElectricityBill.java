package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------- ElectricityBill ----------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of units: ");
		try {
			int units = scanner.nextInt();
			int charges = 0;
			if (units < 100) {
				System.out.print("Charges: " + charges);
			} else if (units <= 200) {
				int c1 = units % 100;
				charges = c1 * 5;
				System.out.print("Charges: " + charges);
			} else if (units <= 500) {
				units = units - 100;
				if (units > 200) {
					int c1 = 100 * 5;
					units = units - 100;
					int c2 = units * 7;
					charges = c1 + c2;
					System.out.print("Charges: " + charges);

				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please Enter an Integer. ");
		} finally {
			scanner.close();
		}

	}

}
