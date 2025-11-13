import java.util.Scanner;

public class menuSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Fried Rice",
            "Fried Noodles",
            "Toasted Bread",
            "Fried Potatoes",
            "Teh Tarik",
            "Cappuccino",
            "Chocolate Ice"
        };

        System.out.println("=== Welcome to Levi Cafe ===");
        System.out.println("Here’s our menu:");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        while (true) {
            System.out.print("\nEnter the name of the item you want to search for (or type 'exit' to quit): ");
            String searchItem = sc.nextLine();

            if (searchItem.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Verdian Cafe! ☕");
                break;
            }

            boolean found = false;
            int indexFound = -1;

            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(searchItem)) {
                    found = true;
                    indexFound = i;
                    break;
                }
            }

            if (found) {
                System.out.println("The item \"" + menu[indexFound] + "\" is available on the menu (index " + indexFound + ").");
            } else {
                System.out.println("Sorry, the item \"" + searchItem + "\" is not available on the menu.");
            }
        }
    }
}
