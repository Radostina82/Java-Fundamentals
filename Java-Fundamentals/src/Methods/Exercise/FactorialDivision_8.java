package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        long factorielFirst = factorielFirst(num1);
        long factorielSecond = factorielSecond(num2);
        double result = factorielFirst * 1.0 / factorielSecond;
        System.out.printf("%.2f", result);
    }

    private static long factorielFirst(int num1){
        long factoriel = 1;
        for (int i = 1; i <= num1 ; i++) {
            factoriel *= i;
        }
        return factoriel;
    }

    private static long factorielSecond(int num2){
        long factoriel = 1;
        for (int i = 1; i <= num2; i++) {
            factoriel *= i;
        }
        return factoriel;
    }

}
