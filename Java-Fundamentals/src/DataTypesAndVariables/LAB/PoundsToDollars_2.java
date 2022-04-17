package DataTypesAndVariables.LAB;

import java.util.Scanner;

public class PoundsToDollars_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());
        double dollarExchangeRate = 1.31;
        double poundsToDollar = pounds * dollarExchangeRate;

        System.out.printf("%.3f", poundsToDollar);
    }
}
