package Methods.LAB;

import java.util.Scanner;

public class Orders_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String products = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        if (products.equals("coffee")){
            double priceCoffee = 1.50;
            printCoffeeOrder(number, priceCoffee);
        }else if (products.equals("water")){
            double priceWater = 1.00;
            printWaterOrder(number, priceWater);
        }else if (products.equals("coke")){
            double priceCoke = 1.40;
            printCokeOrder(number, priceCoke);
        }else if (products.equals("snacks")){
            double snacks = 2.00;
            printSnacksOrder(number, snacks);
        }
    }

    private static void printCoffeeOrder(int number, double priceCoffee) {
        System.out.printf("%.2f", number * priceCoffee);
    }

    private static void printWaterOrder(int number, double priceWater) {
        System.out.printf("%.2f", number * priceWater);
    }

    private static void printCokeOrder(int number, double priceCoke) {
        System.out.printf("%.2f", number * priceCoke);
    }

    private static void printSnacksOrder(int number, double snacks) {
        System.out.printf("%.2f", number * snacks);
    }

}
