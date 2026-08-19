package training2;
import java.util.Scanner;

public class work {

    static Scanner sc = new Scanner(System.in);

    static String name;
    static int age;
    static String designation;
    static double salary;
    static boolean employeeCreated = false;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n----- EMPLOYEE MENU -----");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    createEmployee();
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    raiseSalary();
                    break;

                case 4:
                    System.out.println("Thank you! Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void createEmployee() {

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter designation (p/t/m): ");
        String choice = sc.nextLine().toLowerCase();

        if (choice.equals("p")) {
            designation = "Programmer";
            salary = 35000;
        }
        else if (choice.equals("t")) {
            designation = "Tester";
            salary = 25000;
        }
        else if (choice.equals("m")) {
            designation = "Manager";
            salary = 50000;
        }
        else {
            System.out.println("Invalid designation.");
            return;
        }

        employeeCreated = true;

        System.out.println("Employee created successfully!");
    }

    static void displayEmployee() {

        if (!employeeCreated) {
            System.out.println("No employee found.");
            return;
        }

        System.out.println("\n----- EMPLOYEE DETAILS -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    static void raiseSalary() {

        if (!employeeCreated) {
            System.out.println("Create an employee first.");
            return;
        }

        System.out.print("Enter raise percentage: ");
        double percent = Double.parseDouble(sc.nextLine());

        salary = salary + (salary * percent / 100);

        System.out.println("Salary increased successfully.");
        System.out.println("New Salary: " + salary);
    }
}
