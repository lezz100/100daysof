// Java program to demonstrate the use of ArrayList with a custom class
import java.util.Scanner;

class Student{
    String name;
    String id;

    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }   
}

public class StudentList {
    public static void main(String[] args) {
        java.util.ArrayList<Student> students = new java.util.ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.hasNextLine();
//Add studets to the list
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.println("Enter ID of student " + (i + 1) + ": ");
            String id = scanner.nextLine();
            students.add(new Student(name, id));
        }

//Display the list of students
System.out.println("List of students: ");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
    
}
