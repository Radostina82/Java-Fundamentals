package Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int result = 0;
        for (int i = 0; i < array.length-1; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j] + array[j+1];
            }
        }
        System.out.println(array[0]);
    }
}
