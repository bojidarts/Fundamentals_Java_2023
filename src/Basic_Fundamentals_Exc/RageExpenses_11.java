package Basic_Lab.Basic_Fundamentals_Exc;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsBroken = lostGames / 2;
        int mouseBroken = lostGames / 3;
        int keyboardsBroken = lostGames / 6;
        int displaysBroken = lostGames / 12;

        double totalExpenses = headsBroken * headsetPrice + mouseBroken * mousePrice + keyboardsBroken * keyboardPrice + displaysBroken * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);

    }
}
