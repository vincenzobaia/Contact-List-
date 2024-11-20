package Lab3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, String> contacts = new HashMap<>();

    public static void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added: " + name);
    }

    public static void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Phone number of " + name + ": " + contacts.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }

    public static void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted: " + name);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("======================");
            System.out.println("Welcome to Contact Application");
            System.out.println("Please Choose an option");
            System.out.println("1. Add A contact");
            System.out.println("2. Search for a contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            System.out.println("======================");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.println("Enter name to search: ");
                    name = scanner.nextLine();
                    searchContact(name);
                    break;
                case 3:
                    System.out.println("Enter name to delete: ");
                    name = scanner.nextLine();
                    deleteContact(name);
                    break;
                case 4:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}