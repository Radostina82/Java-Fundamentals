package MidExamExercise.ProgrammingFundamentalsMidExam_1;

import java.util.Scanner;

public class ComputerStore_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalPriceWithoutTaxes = 0.0;
        double taxes = 0.0;
        double totalPrice = 0.0;

        while (!input.equals("special")) {
            if (input.equals("regular")) {

                taxes = totalPriceWithoutTaxes * 0.2;
                totalPrice = totalPriceWithoutTaxes + taxes;
                break;
            }
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                totalPriceWithoutTaxes += price;
            }

            input = scanner.nextLine();
            if (input.equals("special")) {
                taxes = totalPriceWithoutTaxes * 0.2;

                totalPrice = (totalPriceWithoutTaxes + taxes) * 0.9;
            }
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPriceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);
        }
    }
}
