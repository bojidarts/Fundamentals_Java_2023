package Basic_Lab.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bp = Double.parseDouble(scanner.nextLine());;
        double dollars = bp * 1.36;
        System.out.printf("%.3f", dollars);

    }
}
