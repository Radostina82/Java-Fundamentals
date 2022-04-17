package Methods.Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTopNumber(number);
    }

    public static void printTopNumber(int number) {
        for (int i = 1; i <= number; i++) {
            int num = i;
            int sum = 0;
            boolean isOdd = false;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                if (digit % 2 != 0) {
                    isOdd = true;
                }
                num /= 10;
            }
            if (sum % 8 == 0 && isOdd) {
                System.out.println(i);
            }
        }
    }
}
