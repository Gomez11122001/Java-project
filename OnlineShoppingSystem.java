package Prince_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OnlineShoppingSystem {
    HashMap<String, User> users = new HashMap<>();
    ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    OnlineShoppingSystem() {
        products.add(new Product("Product 1", 10.0));
        products.add(new Product("Product 2", 20.0));
        products.add(new Product("Product 3", 30.0));
    }

    void register() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        users.put(username, new User(username, password));
        System.out.println("Registration successful!");
    }

    void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        User user = users.get(username);
        if (user != null && user.password.equals(password)) {
            ShoppingCart cart = new ShoppingCart();
            while (true) {
                System.out.println("\nProducts:");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(i + 1 + ". " + products.get(i).name + " - $" + products.get(i).price);
                }
                System.out.println("0. View cart");
                System.out.print("Enter product number to add to cart (0 to checkout): ");
                int productNumber = scanner.nextInt();
                scanner.nextLine();
                if (productNumber == 0) {
                    System.out.println("\nCart:");
                    for (Product product : cart.products) {
                        System.out.println(product.name + " - $" + product.price);
                    }
                    System.out.println("Total: $" + cart.getTotal());
                    break;
                } else if (productNumber > 0 && productNumber <= products.size()) {
                    Product product = products.get(productNumber - 1);
                    cart.addProduct(product);
                    System.out.println(product.name + " added to cart.");
                } else {
                    System.out.println("Invalid product number.");
                }
            }
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}

