package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine()); // коефициент изтощение
        int count = 0; // броя намушквания
        int startPower = power;

        while (power >= distance){
            count++;
            power -= distance;
            if (power == startPower/2.0){
                if (exhaustionFactor > 0){
                    power /= exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
