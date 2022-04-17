package Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumEven = 0;// сума на четните
        int sumOdd = 0;//сума на нечетните числа

        for (int i = 0; i <= number.length - 1; i++) {
            if (number[i] % 2 == 0) {
                sumEven += number[i];
            }else{
                sumOdd += number[i];
            }
        }
        System.out.println(sumEven - sumOdd);

    }
}
