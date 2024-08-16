package libraryManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Book> bookList = addBook();
		displayBook(bookList);
		
		
		
	}
	
	public static ArrayList<Book> addBook() throws IOException {
		ArrayList<Book> bookList = new ArrayList<Book>();
		String option;
		
		do {
			System.out.println("Enter details for a new book!!!");
			
			System.out.print("Enter the Title: ");
			String title = br.readLine();
			
			System.out.print("Enter the subtitle(or press ENTER to skip): ");
			String subTitle = br.readLine();

			if (subTitle == null) {
				Book noSubBook = new Book(subTitle);
				bookList.add(noSubBook);
			}
			
			Book book = new Book(title, subTitle);
			bookList.add(book);
			
			System.out.print("Do you want to enter another book? (yes/no): ");
			option = br.readLine();
			
			System.out.println();
		}while(option.equalsIgnoreCase("yes"));
		
		return bookList;
	}
	
	public static void displayBook(ArrayList<Book> bookList) {
		System.out.println("Library Inventory:");
		
		for(Book book: bookList) {
			book.dislay();
			System.out.println();
		}
		
		System.out.println("Total number of book created: " + Book.count);
		
		
	}

}
