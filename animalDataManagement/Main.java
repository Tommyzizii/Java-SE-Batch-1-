package animalDataManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		inputData();
	}
	
	public static void inputData() throws IOException {
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		String option;
		int count = 0;
		
		do {
			System.out.print("Enter animal name: ");
			String name = br.readLine();
			System.out.print("Enter animal age: ");
			int age = Integer.parseInt(br.readLine());
			System.out.print("Enter animal species: ");
			String species = br.readLine();
			
			Animal animal = new Animal();
			animal.name = name;
			animal.age = age;
			animal.species = species;
			
			animalList.add(animal);
			count++;
		
			System.out.print("Do you want to add a new Animal(Yes/No): ");
			option = br.readLine();
			
			System.out.println();
			
		}while(option.equalsIgnoreCase("Yes"));
		
		System.out.print("Animal Program Exceution\n");
		System.out.println("Total Number of animal:" + count);
		
		int i = 1;
		for (Animal animal: animalList) {
			System.out.println();
			System.out.println("Animal:"+ i);
			animal.diaplay();
			i++;
			
		}
		
		
	}
	

}
