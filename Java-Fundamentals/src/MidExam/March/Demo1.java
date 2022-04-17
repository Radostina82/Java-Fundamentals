package MidExam.March;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceFuelPerKilometer = Double.parseDouble(scanner.nextLine());
        double expensesFoodPerDay = Double.parseDouble(scanner.nextLine());
        double priceRoomPerNight = Double.parseDouble(scanner.nextLine());

        int countDays = 0;
        double totalExpensesFood = people * expensesFoodPerDay * days;
        double totalExpensesFuel = 0.0;
        double totalExpensesRoom = 0.0;
       /* double expensesFood = 0.0;
        double expensesFuel = 0.0;
        double expensesRoom = 0.0;*/
        double additionalExpenses = 0.0;
        double totalExpenses = 0.0;
        boolean isTrue = false;

        if (people > 10) {
            totalExpensesRoom = people * days * priceRoomPerNight * 0.75;
            totalExpenses = totalExpensesFood + totalExpensesRoom;
        } else {
            totalExpenses = totalExpensesFood + people * days * priceRoomPerNight;
        }
        while (days > 0) {
            double kilometerPerDay = Double.parseDouble(scanner.nextLine());
            days--;
            countDays++;
            totalExpensesFuel = kilometerPerDay * priceFuelPerKilometer;
            totalExpenses = totalExpenses + totalExpensesFuel;

            if (countDays % 3 == 0 || countDays % 5 == 0) {
                additionalExpenses = totalExpenses * 0.4;
                totalExpenses = totalExpenses + additionalExpenses;
            }
            if (countDays % 7 == 0) {
                totalExpenses = totalExpenses - totalExpenses / people;
            }


            if (totalExpenses > budget) {
                isTrue = true;

                break;
            }
        }
        if (isTrue) {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", totalExpenses - budget);
        }else{
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - totalExpenses);

        }

    }
}
