
import java.util.Scanner;

public class Campus_cafe_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        int selection;
        int quantity;

        double price_item = 0.0;
        double item_cost;
        double total_cost = 0.0;

        String item = "";
        String anotherOrder = "yes";

        // Repeat ordering process
        while (anotherOrder.equalsIgnoreCase("yes")) {

            // Display menu
            System.out.println("\n---- CAMPUS CAFE MENU ----");
            System.out.println("1. Pumpkin Chai - $6.77");
            System.out.println("2. Iced Coffee - $4.56");
            System.out.println("3. Hot Chocolate - $5.88");
            System.out.println("4. Matcha Latte - $5.45");
            System.out.println("5. Blueberry Muffin - $3.79");
            System.out.println("6. Chocolate Chip Cookie - $3.58");
            System.out.println("7. Bagel - $3.59");
            System.out.println("8. Fruit Cup - $6.30");

            // Get customer selection
            System.out.print("\nSelect an item (1-8): ");
            selection = input.nextInt();

            // Determine item and price
            switch (selection) {

                case 1:
                    item = "Pumpkin Chai";
                    price_item = 6.77;
                    break;

                case 2:
                    item = "Iced Coffee";
                    price_item = 4.56;
                    break;

                case 3:
                    item = "Hot Chocolate";
                    price_item = 5.88;
                    break;

                case 4:
                    item = "Matcha Latte";
                    price_item = 5.45;
                    break;

                case 5:
                    item = "Blueberry Muffin";
                    price_item = 3.79;
                    break;

                case 6:
                    item = "Chocolate Chip Cookie";
                    price_item = 3.58;
                    break;

                case 7:
                    item = "Bagel";
                    price_item = 3.59;
                    break;

                case 8:
                    item = "Fruit Cup";
                    price_item = 6.30;
                    break;

                default:
                    System.out.println(
                        "Invalid selection. Please choose an item from the menu."
                    );
                    continue;
            }

            // Get quantity
            System.out.print("Enter quantity: ");
            quantity = input.nextInt();

            // Calculate current item cost
            item_cost = price_item * quantity;

            // Add item cost to final total
            total_cost += item_cost;

            // Display current order
            System.out.println("\n----- ORDER -----");
            System.out.println("Item: " + item);
            System.out.println("Price: $" + price_item);
            System.out.println("Quantity: " + quantity);
            System.out.println("Item Cost: $" + item_cost);

            // Ask customer if they want another item
            System.out.print("\nWould you like to order another item? yes/no: ");
            anotherOrder = input.next();
        }

        // Final total
        System.out.println("\n----- FINAL ORDER -----");
        System.out.println("Your final total is: $" + total_cost);
        System.out.println("Thank you for visiting Campus Cafe!");

        input.close();
    }
}
