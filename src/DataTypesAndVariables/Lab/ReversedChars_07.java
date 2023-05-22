package Basic_Lab.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        char third = scanner.next().charAt(0);
        String result = third + " " + second + " " + first + " ";
        System.out.println(result);
    }
}
