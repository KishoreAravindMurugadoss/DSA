package tut8_Assingments;

import java.util.Scanner;

public class SimpleCalC {

	public static void main(String[] args) {

		System.out.println("---------- Simple Calculator ----------");
		Scanner s = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.print("First Number: ");
			double n1 = s.nextDouble();
			System.out.print("Second Number: ");
			double n2 = s.nextDouble();
			System.out.println("Choose any one from the following:");
			System.out.println("1 ---> Addtion");
			System.out.println("2 ---> Subtraction");
			System.out.println("3 ---> Multiplication");
			System.out.println("4 ---> Division");
			System.out.println("5 ---> Difference");
			System.out.println("6 ---> Exit Loop");
			int option = s.nextInt();
			switch (option) {
				case 1: {
					double ans = add(n1, n2);
					System.out.println(ans);
					break;
				}
				case 2: {
					double ans = sub(n1, n2);
					System.out.println(ans);
					break;
				}
				case 3: {
					double ans = mul(n1, n2);
					System.out.println(ans);
					break;
				}
				case 4: {
					double ans = div(n1, n2);
					System.out.println(ans);
					
					break;
				}
				case 5: {
					double ans = diff(n1, n2);
					System.out.println(ans);
					break;
				}
				case 6: {
					loop = false;
					break;
				}
				default :
					System.out.println("Invalid Input");
					break;
			}
		}
	}

	public static double div(double n1, double n2) {
		double ans = 0;
		if (n2 != 0) {
			ans = n1 / n2;
		}
		else {
			System.out.println("Zero can not be a divisor!");
			ans = Double.NaN;
		}
		return ans;
	}

	public static double mul(double n1, double n2) {
		return n1 * n2;
	}

	public static double diff(double n1, double n2) {
		if (n2 > n1) {
			double temp = n1;
			n1 = n2;
			n2 = temp;
		}
		return n1 - n2;
	}
	public static double sub(double n1, double n2) {
		return n1 - n2;
	}

	public static double add(double n1, double n2) {
		return n1 + n2;
	}

}
