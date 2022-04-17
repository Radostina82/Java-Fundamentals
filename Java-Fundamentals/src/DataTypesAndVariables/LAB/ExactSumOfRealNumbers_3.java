package DataTypesAndVariables.LAB;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= count; i++) {
            BigDecimal num = new BigDecimal(scanner.nextLine());
            sum = sum.add(num);
        }
        System.out.print(sum);
    }
}
