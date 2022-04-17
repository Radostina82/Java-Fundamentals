package TextProcessingLab;

import java.util.Scanner;

public class Substring_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(key.toLowerCase())){
            int beginIndex = text.indexOf(key.toLowerCase());
            int endIndex = beginIndex + key.length();
            text = text.substring(0, beginIndex) + text.substring(endIndex);
        }
        System.out.println(text);
    }
}
