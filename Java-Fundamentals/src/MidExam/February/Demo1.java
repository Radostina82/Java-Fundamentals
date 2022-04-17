package MidExam.February;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountBiscuits = Integer.parseInt(scanner.nextLine());
        int countWorker = Integer.parseInt(scanner.nextLine());
        int allBiscuit = Integer.parseInt(scanner.nextLine());

        int producePerDay = amountBiscuits * countWorker;
        int countDays = 30;
        double totalProduce = 0.0;

        while (countDays > 0) {
            countDays--;
            if (countDays % 3 == 0) {
                totalProduce += Math.floor(producePerDay*0.75);
            } else {
                totalProduce += Math.floor(producePerDay);
            }
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalProduce);
        double difference = 0.0;
        if (totalProduce >= allBiscuit) {
            difference = totalProduce - allBiscuit;
            System.out.printf("You produce %.2f percent more biscuits.%n", difference / allBiscuit * 100);
        } else {
            difference = allBiscuit - totalProduce;
            System.out.printf("You produce %.2f percent less biscuits.", difference / allBiscuit * 100);
        }

    }
}
