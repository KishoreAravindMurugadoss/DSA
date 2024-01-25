package tut9_Assingnments;

import java.util.*;

public class ProductSumSub {

	public static void main(String[] args) {
		System.out.println("---------- Subtract the Product and Sum of Digits of an Integer ----------");
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter an Integer: ");
		try {
			int num = s.nextInt();
			int sum = sum(num);
			System.out.println("Sum of the Digits: " + sum);
			int pro = pro(num);
			System.out.println("product of the Digits: " + pro);
			sub(num, sum, pro);
			
			
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input!!! Please Enter only Integer type!");
			s.next();
		}
		s.close();
	}

	private static void sub(int num, int sum, int pro) {
		System.out.println("Subtraction of the Product and Sum of Digits of the given Integer is " + (pro - sum));
	}
	
	private static int pro(int num) {
		int pro = 1;
		while (num > 0) {
			pro = pro * (num % 10);
			num /= 10;
		}
		return pro;
	}
	
	private static int sum(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num /= 10;
		}
		return sum;
	}
}
