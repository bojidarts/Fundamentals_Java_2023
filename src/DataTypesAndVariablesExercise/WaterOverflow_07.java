package Basic_Lab.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            if (sum + quantities <= 255) {
                sum += quantities;
            } else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(sum);
    }
}
