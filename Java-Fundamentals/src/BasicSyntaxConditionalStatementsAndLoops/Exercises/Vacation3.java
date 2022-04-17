package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Vacation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (day.equals("Friday")) {
            if (type.equals("Students")) {
                price = n * 8.45;

                if (n >= 30) {
                    price *= 0.85;
                }
            } else if (type.equals("Business")) {
                price = n * 10.90;

                if (n >= 100) {
                    price = (n - 10) * 10.9;
                }
            } else if (type.equals("Regular")) {
                price = n * 15.0;

                if (n >= 10 && n <= 20) {
                    price *= 0.95;
                }
            }
        } else if (day.equals("Saturday")) {
            if (type.equals("Students")) {
                price = n * 9.8;

                if (n >= 30) {
                    price *= 0.85;
                }
            } else if (type.equals("Business")) {
                price = n * 15.6;

                if (n >= 100) {
                    price = (n - 10) * 15.6;
                }
            } else if (type.equals("Regular")) {
                price = n * 20;

                if (n >= 10 && n <= 20) {
                    price *= 0.95;
                }
            }
        } else if (day.equals("Sunday")) {
            if (type.equals("Students")) {
                price = n * 10.46;

                if (n >= 30) {
                    price *= 0.85;
                }
            } else if (type.equals("Business")) {
                price = n * 16.0;

                if (n >= 100) {
                    price = (n - 10) * 16.0;
                }
            } else if (type.equals("Regular")) {
                price = n * 22.5;

                if (n >= 10 && n <= 20) {
                    price *= 0.95;
                }
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
