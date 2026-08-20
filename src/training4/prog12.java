package training4;

import java.util.Scanner;

public class prog12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double a, b, result;

        do {

            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();

                    result = a + b;

                    System.out.println("Addition: " + result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();

                    result = a - b;

                    System.out.println("Subtraction: " + result);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();

                    result = a * b;

                    System.out.println("Multiplication: " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();

                    if (b != 0) {
                        result = a / b;
                        System.out.println("Division: " + result);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}