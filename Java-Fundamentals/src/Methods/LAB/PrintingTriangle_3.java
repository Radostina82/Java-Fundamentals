package Methods.LAB;

import java.util.Scanner;

public class PrintingTriangle_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());// височината
        printTriangle(height);
    }

    private static void printTriangle(int height) {
        printTopHalf(height);
        printBottomHalf(height);
    }

    private static void printTopHalf(int height) {
        for (int i = 1; i <= height; i++) {
            printSingleLine(i);
        }
    }

    private static void printBottomHalf(int height) {
        for (int i = height-1; i >= 1 ; i--) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int i) {
        for (int j = 1; j <=i ; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
