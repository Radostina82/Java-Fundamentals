package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class VendingMachine_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coins = scanner.nextLine();
        double sum = 0.0;

        while (!coins.equals("Start")) {

            double money = Double.parseDouble(coins);
            if (money != 0.1 && money != 0.2 && money != 0.5 && money != 1.0 && money != 2.0) {
                System.out.printf("Cannot accept %.2f%n", money);
            } else {
                sum += money;
            }
            coins = scanner.nextLine();
        }
        String products = scanner.nextLine();
        while (!products.equals("End")) {
            if (products.equals("Nuts")) {
                if (sum >= 2) {
                    System.out.printf("Purchased %s%n", products);
                    sum -= 2;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (products.equals("Water")){
                if (sum >=0.7){
                    System.out.printf("Purchased %s%n", products);
                    sum -= 0.7;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (products.equals("Crisps")){
                if (sum>=1.5){
                    System.out.printf("Purchased %s%n", products);
                    sum -= 1.5;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (products.equals("Soda")){
                if (sum>=0.8){
                    System.out.printf("Purchased %s%n", products);
                    sum-=0.8;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (products.equals("Coke")){
                if (sum>=1.0){
                    System.out.printf("Purchased %s%n", products);
                    sum-=1.0;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else{
                System.out.println("Invalid product");
            }
            products = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
