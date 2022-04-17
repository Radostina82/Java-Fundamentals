package DataTypesAndVariables.LAB;

import java.util.Scanner;

public class CenturiesToMinutes_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        double day = 365.2422;
        double days = day * years;
        double hours = days * 24;
        double minutes = hours * 60;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
    }
}
