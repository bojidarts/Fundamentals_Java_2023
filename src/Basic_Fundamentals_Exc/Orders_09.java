package Basic_Lab.Basic_Fundamentals_Exc;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= n; i++) {
            double pricePrtCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());
            double priceCoffee = pricePrtCapsule * days * countCapsules;
            System.out.printf("The price for the coffee is: $%.2f%n", priceCoffee);
            totalPrice += priceCoffee;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
