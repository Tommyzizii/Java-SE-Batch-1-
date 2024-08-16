package studentsMarksManagementSystem;

import java.util.Arrays;

public class Student {
    
    private String name;
    private int[] marks;
    private String ad1;
    private String ad2;

    public Student(String name, int[] marks, String ad1, String ad2) {
        this.name = name;
        this.marks = marks;
        this.ad1 = ad1;
        this.ad2 = ad2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getAd1() {
        return ad1;
    }

    public void setAd1(String ad1) {
        this.ad1 = ad1;
    }

    public String getAd2() {
        return ad2;
    }

    public void setAd2(String ad2) {
        this.ad2 = ad2;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("GPA: " + getGPA());
        System.out.println("Address 1: " + ad1);
        System.out.println("Address 2: " + (ad2 == null ? "Not Provided" : ad2));
    }
    
    public double getGPA() {
        double total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }
}
