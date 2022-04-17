package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            //1. взимам първия елемент
            //2. премествам всички елементи
            //3. слагаме първия елемент на последна позиция
            int firstNumber = array[0];
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            array[array.length - 1] = firstNumber;
        }
        for (int number: array) {

            System.out.print(number + " ");
        }
    }
}
