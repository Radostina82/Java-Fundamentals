package MidExam.February;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int point = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int sumRight = 0;//дясно
        int sumLeft = 0;//ляво
        String positions = "";


        if (input.equals("cheap")) {
            for (int i = point + 1; i <= number.size() - 1; i++) {
                if (number.get(i) < number.get(point)) {
                    sumRight += number.get(i);
                }
            }
            for (int i = 0; i < point; i++) {
                if (number.get(i) < number.get(point)) {
                    sumLeft += number.get(i);
                }
            }
            if (sumRight > sumLeft) {
                positions = "Right";
                System.out.printf("%s - %d%n", positions, sumRight);
            } else if (sumRight < sumLeft) {
                positions = "Left";
                System.out.printf("%s - %d%n", positions, sumLeft);
            } else {
                positions = "Left";
                System.out.printf("%s - %d%n", positions, sumLeft);
            }

        } else if (input.equals("expensive")) {
            for (int i = point + 1; i <= number.size() - 1; i++) {
                if (number.get(i) >= number.get(point)) {
                    sumRight += number.get(i);
                }
            }
            for (int i = 0; i < point; i++) {
                if (number.get(i)>=number.get(point)) {
                    sumLeft += number.get(i);
                }
            }

                if (sumRight > sumLeft) {
                    positions = "Right";
                    System.out.printf("%s - %d%n", positions, sumRight);
                } else if (sumRight < sumLeft) {
                    positions = "Left";
                    System.out.printf("%s - %d%n", positions, sumLeft);
                } else {
                    positions = "Left";
                    System.out.printf("%s - %d%n", positions, sumLeft);
                }

        }
    }
}
