package Basic_Lab;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(number);
            sum += number;
            number += 2;


        }

        System.out.printf("Sum: %d", sum);
    }


}
