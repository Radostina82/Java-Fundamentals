package Methods.LAB;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int result = getMultiplyEvensAndOdds(Math.abs(number));
        System.out.println(result);
    }

    private static int getMultiplyEvensAndOdds(int number) {
        int evenSum = getSumEven(number);
        int oddSum = getSumOdd(number);

        return evenSum * oddSum;
    }

    private static int getSumEven(int number) {
        int evenSum = 0;
        while (number > 0) {
            int digitEven = number % 10;
            if (digitEven % 2 == 0) {
                evenSum += digitEven;
            }
            number /= 10;
        }
        return evenSum;
    }


    private static int getSumOdd(int number) {
        int oddSum = 0;
        while (number > 0) {
            int digitOdd = number % 10;
            if (digitOdd % 2 == 1) {
                oddSum += digitOdd;
            }
            number /= 10;
        }
        return oddSum;
    }

}
