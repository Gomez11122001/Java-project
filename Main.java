package Prince_project;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        OnlineShoppingSystem system = new OnlineShoppingSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter option number: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    system.register();
                    break;
                case 2:
                    system.login();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
