package Basic_Lab.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxKegModel = "";
        for (int i = 0; i < n; i++) {
            String nameKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * (Math.pow(radius, 2)) * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxKegModel = nameKeg;

            }
        }
        System.out.println(maxKegModel);
    }
}
