package tut9_Assingnments;

import java.util.InputMismatchException;
import java.util.Scanner;


public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- Perfect Number Checker ----------");
        
        try {
            System.out.print("Enter a positive integer: ");
            int input = scanner.nextInt();

            if (input <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {
                if (isPerfectNumber(input)) {
                    System.out.println(input + " is a perfect number.");
                } else {
                    System.out.println(input + " is not a perfect number.");
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid positive integer.");
            scanner.nextLine();
        } finally {
            scanner.close();
        }
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
