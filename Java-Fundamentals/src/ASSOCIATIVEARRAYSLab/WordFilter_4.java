package ASSOCIATIVEARRAYSLab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []words = scanner.nextLine().split("\\s+");

        words = Arrays.stream(words).filter(e -> e.length() %2 ==0).toArray(String[]::new);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
