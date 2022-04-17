package Methods.Exercise;

import java.util.Scanner;

public class TopNumber_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTopNumber(number);
    }

    public static void printTopNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (devisibleByEigth(i) && oddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean devisibleByEigth(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 8 == 0;
    }

    public static boolean oddDigit(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                count++;
            }
            num /= 10;
        }
        return count > 0;
    }
}

