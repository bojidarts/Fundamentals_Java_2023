package Basic_Lab.Basic_Fundamentals_Exc;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSingleLightSaber = Double.parseDouble(scanner.nextLine());
        double priceSingleRobe = Double.parseDouble(scanner.nextLine());
        double priceSingleBelt = Double.parseDouble(scanner.nextLine());

        double saberCount = Math.ceil(countStudents * 1.10);
        double saberPriceTotal = saberCount * priceSingleLightSaber;

        double priceRobesTotal = priceSingleRobe * countStudents;

        int beltsCount = countStudents - countStudents / 6;
        double priceBeltsTotal = priceSingleBelt * beltsCount;

        double totalPrice = saberPriceTotal + priceBeltsTotal + priceRobesTotal;
        if (budget >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }

    }
}
