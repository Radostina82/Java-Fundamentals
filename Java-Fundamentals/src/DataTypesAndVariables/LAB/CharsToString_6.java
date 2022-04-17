package DataTypesAndVariables.LAB;

import java.util.Scanner;

public class CharsToString_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        System.out.printf("%s%s%s", line1, line2, line3);
    }
}
