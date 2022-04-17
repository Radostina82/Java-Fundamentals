package DataTypesAndVariables.LAB;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());


        for (int i= 1; i <= count; i++) {
            int speshialNumber = 0;
            speshialNumber = i;
            int sum = 0;
            while (speshialNumber > 0) {
                sum += speshialNumber % 10;
                speshialNumber = speshialNumber / 10;
            }
            if((sum == 5) || (sum == 7) || (sum == 11)) {
                System.out.printf("%d -> True%n", i);
            }
            else{
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}