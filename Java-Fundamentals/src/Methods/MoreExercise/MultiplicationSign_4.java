package Methods.MoreExercise;

import java.util.Scanner;

public class MultiplicationSign_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        boolean isNegative = checkNumbersIsNegative(num1, num2, num3);
        boolean isZero = checkResultIsZero(num1, num2, num3);

        if (isNegative){
            System.out.println("negative");
        }else if (isZero){
            System.out.println("zero");
        }else{
            System.out.println("positive");
        }

    }

    public static boolean checkNumbersIsNegative(int num1, int num2, int num3) {
        boolean isNegative = true;
        if (num1 < 0 && num2 <0 && num3 >0){
            isNegative = false;
        }else if (num1<0 && num2 > 0 && num3 <0){
            isNegative = false;
        } else if (num1 > 0 && num2 <0 && num3<0){
            isNegative = false;
        } else if (num1 > 0 && num2 > 0 && num3 >0){
            isNegative = false;
        }else if (num1 == 0 || num2 ==0 || num3 ==0){
            isNegative = false;
        }
        return isNegative;
    }

    public static boolean checkResultIsZero(int num1, int num2, int num3) {
        return num1 == 0 || num2 == 0 || num3 == 0;
    }
}
