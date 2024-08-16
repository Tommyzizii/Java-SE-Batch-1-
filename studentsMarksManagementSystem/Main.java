package studentsMarksManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        ArrayList<Student> studentList = importData();
        display(studentList);
        highestGPA(studentList);
        displayMeanMarks(studentList);
    }
    
    public static ArrayList<Student> importData() throws IOException {
        ArrayList<Student> studentList = new ArrayList<>();
        String option;
        
        do {
            int[] marksArray = new int[6];
            
            System.out.println("Enter details for a new student:");
            
            System.out.print("Name: ");
            String name = br.readLine();
            
            System.out.println("Enter marks for 6 subjects (or less, defaults to 0):");
            for (int i = 0; i < 6; i++) {
                System.out.print("Subject " + (i + 1) + " : ");
                String input = br.readLine();
                marksArray[i] = input.isEmpty() ? 0 : Integer.parseInt(input);
            }
            
            System.out.print("Enter address 1: ");
            String ad1 = br.readLine();
            
            System.out.print("Enter address 2 (or press Enter to skip): ");
            String ad2 = br.readLine();
            ad2 = ad2.isEmpty() ? null : ad2;
            
            Student student = new Student(name, marksArray, ad1, ad2);
            studentList.add(student);
            
            System.out.print("Do you want to enter another student? (yes/no): ");
            option = br.readLine();
            System.out.println();
            
        } while (option.equalsIgnoreCase("yes"));
        
        return studentList;
    }
    
    public static void display(ArrayList<Student> studentList) {
        System.out.println("\nStudent Details:");
        for (Student student : studentList) {
            student.display();
            System.out.println();
        }
    }
    
    public static void highestGPA(ArrayList<Student> studentList) {
        double highestGpa = 0.0;
        int position = -1;
        
        for (int i = 0; i < studentList.size(); i++) {
            double gpa = studentList.get(i).getGPA();
            if (gpa > highestGpa) {
                highestGpa = gpa;
                position = i;
            }
        }
        
        if (position != -1) {
            System.out.println("Student with the highest GPA:");
            studentList.get(position).display();
        } else {
            System.out.println("No students found.");
        }
    }
    
    public static void displayMeanMarks(ArrayList<Student> studentList) {
        double[] totalMarks = new double[6];
        int numberOfStudents = studentList.size();
        
        for (Student student : studentList) {
            int[] marks = student.getMarks();
            for (int i = 0; i < marks.length; i++) {
                totalMarks[i] += marks[i];
            }
        }
        
        System.out.println("\nMean Marks:");
        for (int i = 0; i < totalMarks.length; i++) {
            double mean = totalMarks[i] / numberOfStudents;
            System.out.println("Subject " + (i + 1) + ": " + mean);
        }
    }
}
