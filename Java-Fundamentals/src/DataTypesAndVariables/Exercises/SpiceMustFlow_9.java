package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class SpiceMustFlow_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine()); //начален добив
        int yield = startingYield; //добив
        int countDays = 0;
        int totalSpice = 0;// общо подправки

        while (yield >= 100){
            countDays++;
            int consumesDay = 26;
            int spiceDay = yield - consumesDay;// останалите подправки в деня след като работниците ядат

            totalSpice += spiceDay;
            yield -= 10;
            if (yield < 100){
                totalSpice -= consumesDay;
            }
        }
        System.out.println(countDays);
        System.out.print(totalSpice);
    }
}
