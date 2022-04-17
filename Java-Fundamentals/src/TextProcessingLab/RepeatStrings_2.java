package TextProcessingLab;

import java.sql.Array;
import java.util.Scanner;

public class RepeatStrings_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String s : input) {
            int count = s.length();

            for (int i = 1; i <=count ; i++) {
                result.append(s);
            }
        }
        System.out.println(result.toString().toLowerCase());
    }
}
