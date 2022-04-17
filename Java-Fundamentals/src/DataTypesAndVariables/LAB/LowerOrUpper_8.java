package DataTypesAndVariables.LAB;

import java.util.Scanner;

public class LowerOrUpper_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        if (Character.isUpperCase(first)){
            System.out.print("upper-case");
        }else if (Character.isLowerCase(first)){
            System.out.print("lower-case");
        }
    }
}
