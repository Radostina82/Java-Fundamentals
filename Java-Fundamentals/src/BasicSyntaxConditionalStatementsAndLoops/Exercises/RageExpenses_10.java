package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int loseGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = loseGame / 2;
        double priceHeadset = countHeadset * headsetPrice;
        int countMouse = loseGame / 3;
        double priceMouse = countMouse * mousePrice;
        int countKeyboard = loseGame / 6;
        double priceKeyboard = countKeyboard * keyboardPrice;
        int countDisplay = loseGame / 12;
        double priceDisplay = countDisplay * displayPrice;

        double totalPrice = priceDisplay + priceHeadset + priceKeyboard + priceMouse;
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);


    }
}
