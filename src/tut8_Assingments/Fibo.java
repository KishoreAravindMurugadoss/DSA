package tut8_Assingments;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {

		System.out.println("---------- Fibonacci Series of 'n' Numbers ----------");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of 'n' : ");
		int n = s.nextInt();
		int n0 = 0;
		int n1 = 1;
		System.out.print(n0 + " , " + n1 + " , ");
		for (int i = 1; i <= n - 2; i++) {
			int n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
			System.out.print(n2 + " , ");
			
		}
	}

}
