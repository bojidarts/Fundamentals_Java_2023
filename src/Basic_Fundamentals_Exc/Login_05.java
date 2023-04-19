package Basic_Lab.Basic_Fundamentals_Exc;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        String input = scanner.nextLine();
        int counter = 0;
        boolean flag = true;
        while (!input.equals(password)) {
            counter++;

            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                flag = false;
                break;
            }
            System.out.println("Incorrect password. Try again.");


            input = scanner.nextLine();

        }
        if (flag) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
