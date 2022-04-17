package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class PrintPartOfASCIITable_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= second ; i++) {

            System.out.print((char)i + " ");
        }
    }
}
