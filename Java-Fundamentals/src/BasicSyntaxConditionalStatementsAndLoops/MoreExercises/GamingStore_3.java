package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class GamingStore_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double spent = 0.0;

        while (!game.equals("Game Time")) {

            if (game.equals("OutFall 4")) {
                if (budget >= 39.99) {
                    System.out.println("Bought OutFall 4");
                    spent += 39.99;
                    budget -= 39.99;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                } else if (budget > 0 && budget < 39.99) {
                    System.out.println("Too Expensive");

                }
            } else if (game.equals("CS: OG")) {
                if (budget >= 15.99) {
                    System.out.println("Bought CS: OG");
                    spent += 15.99;
                    budget -= 15.99;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                } else if (budget > 0 && budget < 15.99) {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("Zplinter Zell")) {
                if (budget >= 19.99) {
                    System.out.println("Bought Zplinter Zell");
                    spent += 19.99;
                    budget -= 19.99;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                } else if (budget > 0 && budget < 19.99) {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("Honored 2")) {
                if (budget >= 59.99) {
                    System.out.println("Bought Honored 2");
                    spent += 59.99;
                    budget -= 59.99;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                } else if (budget > 0 && budget < 59.99) {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("RoverWatch")) {
                if (budget >= 29.99) {
                    System.out.println("Bought RoverWatch");
                    spent += 29.99;
                    budget -= 29.99;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                } else if (budget > 0 && budget < 29.99) {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("RoverWatch Origins Edition")) {
                if (budget >= 39.99) {
                    System.out.println("Bought RoverWatch Origins Edition");
                    spent += 39.99;
                    budget -= 39.99;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                } else if (budget > 0 && budget < 39.99) {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }

            game = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, budget);
    }
}
