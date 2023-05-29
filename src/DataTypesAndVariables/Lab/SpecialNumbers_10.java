package Basic_Lab.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
           boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            String capitalizedResult = isSpecial ? "True" : "False";
            System.out.printf("%d -> %s\n", i, capitalizedResult);
        }

    }
}
