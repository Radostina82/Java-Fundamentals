package Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_7new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int result = 0;
        for (int i = 0; i < array.length; i++) {//0 1 2 3 4
            int[] newArray = new int[array.length - 1];

            for (int j = 0; j <= newArray.length-1; j++) {
                newArray[j] = array[j] + array[j + 1];

            }
            array = newArray;
        }
    }
}
