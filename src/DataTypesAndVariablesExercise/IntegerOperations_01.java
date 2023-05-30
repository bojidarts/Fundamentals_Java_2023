package Basic_Lab.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int forthNum = Integer.parseInt(scanner.nextLine());

        int firstSecond = firstNum + secondNum;
        int divide = firstSecond / thirdNum;
        int result = divide * forthNum;
        System.out.println(result);

    }
}
