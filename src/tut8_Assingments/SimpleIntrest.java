package tut8_Assingments;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("---------------- Simple Intrest Program ----------------");
		System.out.print("Principal: ");
		double p = s.nextDouble();
		System.out.print("Number of Years: ");
		float n = s.nextFloat();
		System.out.print("Rate of Intrest: ");
		float r = s.nextFloat();
		simpleInt(p, n, r);
	}

	public static void simpleInt(double p, float n, float r) {

		double simpleInt = (p * n * r) / 100;
		System.out.println("Estimated Simple Intrest: " + simpleInt);
	}

}
