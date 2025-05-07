
class Employee{
    String name;
    int id;
    double salary;

    // Constructor to initialize Employee object
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
//Subclass (Manager) extending Employee class
class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary); // Call the constructor of the superclass (Employee)
        this.department = department;
    }

    // Overriding the displayDetails method to include department information
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

//InheritanceExample class to demonstrate the use of inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 101, 50000);
        System.out.println("Employee Details:");
        emp.displayDetails();

        // Create a Manager object
        Manager mgr = new Manager("Jane Smith", 102, 70000, "Sales");
        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}