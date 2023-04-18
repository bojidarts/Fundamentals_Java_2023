package Basic_Lab;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        switch (day) {
            case "Weekday":
                if (0 <= age && age <= 18){
                    price = 12;
                    System.out.println(price + "$");
                }else if (age > 18 && age <= 64){
                    price = 18;
                    System.out.println(price + "$");
                }else if (age > 64 && age <= 122){
                    price = 12;
                    System.out.println(price + "$");
                }else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (0 <= age && age <= 18){
                    price = 15;
                    System.out.println(price + "$");
                }else if (age > 18 && age <= 64){
                    price = 20;
                    System.out.println(price + "$");
                }else if (age > 64 && age <= 122){
                    price = 15;
                    System.out.println(price + "$");
                }else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (0 <= age && age <= 18){
                    price = 5;
                    System.out.println(price + "$");
                }else if (age > 18 && age <= 64){
                    price = 12;
                    System.out.println(price + "$");
                }else if (age > 64 && age <= 122){
                    price = 10;
                    System.out.println(price + "$");
                }else {
                    System.out.println("Error!");
                }
                break;
        }

    }
}
