package Methods.MoreExercise;

import java.util.Scanner;

public class DataTypes_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        if (validateInt(firstLine)) {
            int number = Integer.parseInt(secondLine);
            System.out.println(number * 2);
        } else if (validateReal(firstLine)) {
            double number = Double.parseDouble(secondLine);
            double result = number * 1.5;
            System.out.printf("%.2f%n", result);

        } else if (validateString(firstLine)) {
            System.out.printf("$%s$%n", secondLine);
        }
    }

    private static boolean validateInt(String firstLine) {
        return firstLine.equals("int");
    }

    private static boolean validateReal(String firstLine) {
        return firstLine.equals("real");
    }

    private static boolean validateString(String firstLine) {
        return firstLine.equals("string");
    }
}
