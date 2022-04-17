package OBJECTSANDCLASSES;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Random random = new Random();

        for (int i = 0; i <= input.length-1 ; i++) {
            int randomIndex = random.nextInt(input.length);
            String element = input[i];
            input[i] = input[randomIndex];
            input[randomIndex] = element;
        }
        for (String s : input) {
            System.out.println(s);
        }
    }
}
