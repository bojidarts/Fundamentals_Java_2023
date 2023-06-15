package Basic_Lab.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        short exhaustionFactorY = Short.parseShort(scanner.nextLine());
        int target = 0;
        double halfN = powerN * 0.5;
        while (powerN >= distanceM) {
            powerN -= distanceM;
            target++;
            if (powerN == halfN && exhaustionFactorY != 0) {
                powerN /= exhaustionFactorY;

            }

        }
        System.out.println(powerN);
        System.out.println(target);
    }
}
