package Basic_Lab.Basic_Fundamentals_Exc;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String kindGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (day) {
            case "Friday":
                if (kindGroup.equals("Students")){
                    price = 8.45;
                    if (number >= 30){
                        price = price - price * 0.15;
                    }
                }else if (kindGroup.equals("Business")){
                    price = 10.90;
                    if (number >= 100){
                        number = number - 10;
                    }
                }else if (kindGroup.equals("Regular")){
                    price = 15;
                    if (number >= 10 && number <= 20){
                        price = price - price * 0.05;
                    }
                }
                break;
            case "Saturday":
                if (kindGroup.equals("Students")){
                    price = 9.80;
                    if (number >= 30){
                        price = price - price * 0.15;
                    }
                }else if (kindGroup.equals("Business")){
                    price = 15.60;
                    if (number >= 100){
                        number = number - 10;
                    }
                }else if (kindGroup.equals("Regular")){
                    price = 20;
                    if (number >= 10 && number <= 20){
                        price = price - price * 0.05;
                    }
                }
                break;
            case "Sunday":
                if (kindGroup.equals("Students")){
                    price = 10.46;
                    if (number >= 30){
                        price = price - price * 0.15;
                    }
                }else if (kindGroup.equals("Business")){
                    price = 16;
                    if (number >= 100){
                        number = number - 10;
                    }
                }else if (kindGroup.equals("Regular")){
                    price = 22.50;
                    if (number >= 10 && number <= 20){
                        price = price - price * 0.05;
                    }
                }
                break;
        }
        double totalPrice = number * price;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
