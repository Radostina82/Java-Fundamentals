package Methods.LAB;

import java.util.Scanner;

public class RepeatString_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String output = repeatString(input, count);
        System.out.println(output);
    }

    private static String repeatString(String input, int count) {
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= count; i++) {
            result.append(input);
        }
        return result.toString();
    }
}
