package TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")){
            StringBuilder result = new StringBuilder();
            for (int i = input.length()-1; i >=0 ; i--) {
                char element = input.charAt(i);
                result.append(element);
            }
            System.out.printf("%s = %s%n",input, result);

            input = scanner.nextLine();
        }
    }
}
