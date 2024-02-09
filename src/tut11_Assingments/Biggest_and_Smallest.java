package tut11_Assingments;

import java.util.Scanner;

public class Biggest_and_Smallest {

	public static void main(String[] args) {
		System.out.println("---------- Biggest and Smallest ----------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter:");
		int a = scanner.nextInt();
		System.out.print("enter:");
		int b = scanner.nextInt();
		System.out.print("enter:");
		int c = scanner.nextInt();
		int max = isBig(a, b, c);
		int min = isSmall(a, b, c);
		System.out.print("Biggest: " + max);
		System.out.println();
		System.out.print("smallest: " + min);
		scanner.close();

	}

	private static int isSmall(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

	private static int isBig(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

}
