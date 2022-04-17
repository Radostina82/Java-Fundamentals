package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class WaterOverflow_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sumLiters = 0;
        for (int i = 1; i <= num; i++) {
            int quantitiesLiters = Integer.parseInt(scanner.nextLine());
            capacity -= quantitiesLiters;
            if (capacity < 0) {
                System.out.println("Insufficient capacity!");
                capacity = capacity + quantitiesLiters;
                continue;

            }
            sumLiters += quantitiesLiters;
        }
        System.out.print(sumLiters);
    }
}
