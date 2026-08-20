package training4;

import java.util.Scanner;

public class prog14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n----- FOOD MENU -----");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Pasta");
            System.out.println("4. Tiramisu");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("You selected Pizza");
                    break;

                case 2:
                    System.out.println("You selected Burger");
                    break;

                case 3:
                    System.out.println("You selected Pasta");
                    break;

                case 4:
                    System.out.println("You selected tiramisu");
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