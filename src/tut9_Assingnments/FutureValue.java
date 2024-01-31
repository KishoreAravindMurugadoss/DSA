package tut9_Assingnments;

import java.util.Scanner;

public class FutureValue {

	public static void main(String[] args) {
		System.out.println("---------- Future Value ----------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Present Value: ");
		double pv = scanner.nextDouble();
		System.out.print("Rate of Intrest: ");
		double r = scanner.nextDouble();
		System.out.print("Number of Compounding Period: ");
		double n = scanner.nextDouble();
		double fv = FindFV(pv, r, n);
		System.out.println("Future Value: " + fv);
		scanner.close();
	}

	private static double FindFV(double pv, double r, double n) {
		double fv = pv * Math.pow((1 + r), n);
		return fv;
	}

}
