package List.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> number2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int size = Math.min(number1.size(), number2.size());

        for (int i = 0; i < size ; i++) {
            System.out.print(number1.get(i) + " " + number2.get(i) + " ");
        }
        printTheRest(number1, size);
        printTheRest(number2, size);
    }

    private static void printTheRest(List<Integer> number, int beginIndex) {
        for (int i = beginIndex; i <= number.size()-1 ; i++) {
            System.out.print(number.get(i) + " ");
        }
    }
}
