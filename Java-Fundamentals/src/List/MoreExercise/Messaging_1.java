package List.MoreExercise;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        StringBuilder messaging = new StringBuilder();

        for (int i = 0; i <= input.length() - 1; i++) {
            messaging.append(input.charAt(i));
        }

        for (int i = 0; i <= numbers.size() - 1; i++) {
            int element = numbers.get(i);
            int sumOfDigits = getSumOfDigits(element);

            if (sumOfDigits > messaging.length()-1){
                sumOfDigits -= messaging.length();
            }

            char currentChar = messaging.charAt(sumOfDigits);

            System.out.print(currentChar);

            messaging.deleteCharAt(sumOfDigits);
        }
    }

    private static int getSumOfDigits(int element) {
        int sum = 0;

        while (element > 0) {

            int digit = element % 10;
            sum += digit;
            element /= 10;
        }
        return sum;
    }
}
