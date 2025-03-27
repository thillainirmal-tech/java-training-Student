class Student {
// Private attributes (encapsulation)
private String name;
private int rollNumber;
private int[] marks;
// Constructor to initialize the attributes
public Student(String name, int rollNumber, int[] marks) {
this.name = name;
this.rollNumber = rollNumber;
this.marks = marks;
}
// Getter methods
public String getName() {
return name;
}
public int getRollNumber() {
return rollNumber;
}
public int[] getMarks() {
return marks;
}
// Setter method for marks
public void setMarks(int[] marks) {
this.marks = marks;
}
// Method to calculate average marks
public double calculateAverage() {
int totalMarks = 0;
for (int mark : marks) {
totalMarks += mark;
}
return (double) totalMarks / marks.length;
}
}
public class Main {
public static void main(String[] args) {
// Create two Student objects
int[] marks1 = { 85, 90, 78, 92, 88 };
Student student1 = new Student("Alice", 101, marks1);
int[] marks2 = { 75, 82, 88, 70, 91 };
Student student2 = new Student("Bob", 102, marks2);
// Display student details and average marks
System.out.println("Student 1 Details:");
System.out.println("Name: " + student1.getName());
System.out.println("Roll Number: " + student1.getRollNumber());
System.out.println("Marks: " + java.util.Arrays.toString(student1.getMarks()));
System.out.println("Average Marks: " + student1.calculateAverage());
System.out.println();
System.out.println("Student 2 Details:");
System.out.println("Name: " + student2.getName());
System.out.println("Roll Number: " + student2.getRollNumber());
System.out.println("Marks: " + java.util.Arrays.toString(student2.getMarks()));
System.out.println("Average Marks: " + student2.calculateAverage());
}
}
