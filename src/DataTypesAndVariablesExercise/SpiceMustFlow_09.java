package Basic_Lab.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalProduction = 0;
        int days = 0;
        while (startingYield >= 100) {
            days++;
            int production = startingYield - 26;
            totalProduction += production;

            startingYield -= 10;
        }
        if (totalProduction >= 26) {
            totalProduction -= 26;
        }
        System.out.println(days);
        System.out.println(totalProduction);
    }
}