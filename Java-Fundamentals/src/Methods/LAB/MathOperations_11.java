package Methods.LAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        double result = calculate(num1, operator, num2);
        System.out.println(new DecimalFormat("0.##").format(result));
    }

    private static double calculate(int num1, String operator, int num2) {
        double result = 0.0;

        if (operator.equals("/")){
            result = 1.0 * num1 / num2;
        }else if (operator.equals("*")){
            result = 1.0 * num1 * num2;
        }else if (operator.equals("+")){
            result = num1 + num2;
        }else if (operator.equals("-")){
            result = num1 - num2;
        }
        return result;
    }
}
