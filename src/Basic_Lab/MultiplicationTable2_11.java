package Basic_Lab.Basic_Lab;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int divisor = Integer.parseInt(scanner.nextLine());
        for (int i = divisor; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d X %d = %d%n", number, i, result);

        }
        if (divisor > 10){
            System.out.printf("%d X %d = %d", number, divisor, number * divisor);
        }

    }
}
