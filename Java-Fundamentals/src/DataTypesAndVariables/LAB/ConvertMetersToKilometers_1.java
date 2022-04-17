package DataTypesAndVariables.LAB;

import java.util.Scanner;

public class ConvertMetersToKilometers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceMeters = Integer.parseInt(scanner.nextLine());
        double distanceKilometers = distanceMeters / 1000.0;

        System.out.printf("%.2f", distanceKilometers);
    }
}
