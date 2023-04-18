package Basic_Lab;

import java.util.Scanner;

public class BackIn30Min_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMin = (hours * 60) + minutes;
        int newTime = totalMin += 30;

        int newHor = newTime / 60;
        int newMin = newTime % 60;
        if (newHor > 23){
            newHor = 0;
        }

        System.out.printf("%d:%02d", newHor, newMin);
    }
}
