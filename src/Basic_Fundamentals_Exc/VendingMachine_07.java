package Basic_Lab.Basic_Fundamentals_Exc;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double coinsSum = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                coinsSum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        double priceProduct = 0;
        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                priceProduct = 2.0;

            } else if (input.equals("Water")) {
                priceProduct = 0.7;

            } else if (input.equals("Crisps")) {
                priceProduct = 1.5;

            } else if (input.equals("Soda")) {
                priceProduct = 0.8;

            } else if (input.equals("Coke")) {
                priceProduct = 1.0;

            } else {
                System.out.println("Invalid product");
                input = scanner.nextLine();
                continue;
            }
            if (coinsSum >= priceProduct){
                coinsSum -= priceProduct;
                System.out.printf("Purchased %s%n", input);
            }else {
                System.out.println("Sorry, not enough money");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", coinsSum);
    }
}
