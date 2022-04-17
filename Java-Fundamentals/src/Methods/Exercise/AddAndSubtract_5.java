package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int sumFirstTwoIntegers = sumFirstTwoIntegers(num1, num2);
        int substract = sumFirstTwoIntegers - num3;
        System.out.println(substract);

    }

    private static int sumFirstTwoIntegers(int num1, int num2){
        return num1 + num2;
    }

}
