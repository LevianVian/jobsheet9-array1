import java.util.Scanner;

public class cafeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] orderNames = new String[n];
        double[] orderPrices = new double[n];
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of order " + (i + 1) + ": ");
            orderNames[i] = sc.nextLine();

            System.out.print("Enter the price of " + orderNames[i] + ": ");
            orderPrices[i] = sc.nextDouble();
            sc.nextLine(); 

            totalCost += orderPrices[i];
        }

        System.out.println("\n--- Cafe Order Summary ---");
        System.out.println("No.\tOrder Name\tPrice");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + orderNames[i] + "\t\t" + orderPrices[i]);
        }

        System.out.println("----------------------------");
        System.out.println("Total cost: " + totalCost);
    }
}
