package loopingExercise;

import java.util.Scanner;

public class FactorialCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}
		System.out.print("The factorial of " + n + " is: " + result);
		scanner.close();

	}

}
