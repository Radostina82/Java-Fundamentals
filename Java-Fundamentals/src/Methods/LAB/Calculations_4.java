package Methods.LAB;

import java.util.Scanner;

public class Calculations_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        if (comand.equals("add")) {
            printAdd(number1, number2);
        } else if (comand.equals("multiply")) {
            printMultiply(number1, number2);
        } else if (comand.equals("subtract")) {
            printSubtract(number1, number2);
        } else if (comand.equals("divide")) {
            printDivide(number1, number2);
        }
    }

    private static void printAdd(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    private static void printMultiply(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    private static void printSubtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    private static void printDivide(int number1, int number2) {
        System.out.println(number1 / number2);
    }

}


