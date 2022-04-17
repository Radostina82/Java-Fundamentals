package Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] number = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            String input = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j <= input.length() - 1; j++) {
                char symbol = input.charAt(j);
                if (symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U') {
                    sum += symbol * input.length();
                }
                else if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                    sum += symbol * input.length();
                }
                else {
                    sum += symbol / input.length();

                }
                number[i] = sum;
            }
        }
        for (int i = 0; i < number.length - 1; i++) {
            int num = 0;
            for (int j = i + 1; j <= number.length - 1; j++) {
                if (number[i] > number[j]) {
                    num = number[i];
                    number[i] = number[j];
                    number[j] = num;
                }
            }
        }
        //Arrays.sort(number);
        for (int num : number) {
            System.out.println(num);
        }
    }
}
