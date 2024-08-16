package loopingExercise;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		
		System.out.println("Multiplication Table for " + n + ":");
		for (int i = 1; i <= 10; i ++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		scanner.close();	
	}

}
