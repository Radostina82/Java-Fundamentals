package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0.0;
        double maxSnowballValue = Double.MIN_VALUE;
        String output = "";
        for (int i = 1; i <= number; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);


            if (snowballValue > maxSnowballValue){
                maxSnowballValue = snowballValue;
                output = String.format("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
            }
        }
        System.out.print(output);
    }
}
