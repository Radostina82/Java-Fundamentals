package MidExamExercise.ProgrammingFundamentalsMidExam_1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int count = 0;
        boolean isWon = false;

        while (!input.equals("end")) {
            int index1 = Integer.parseInt(input.split("\\s+")[0]);
            int index2 = Integer.parseInt(input.split("\\s+")[1]);
            count++;
            if (index1 == index2 || index1 < 0 || index1 > numbers.size() - 1 || index2 < 0 || index2 > numbers.size() - 1) {
                int middle = numbers.size() / 2;
                String element = "-" + count + "a";
                numbers.add(middle, element);
                numbers.add(middle, element);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (numbers.get(index1).equals(numbers.get(index2))) {
                    String element1 = numbers.get(index1);

                    numbers.set(index1, "hello");
                    numbers.set(index2, "hello");
                    numbers.remove("hello");
                    numbers.remove("hello");
                    System.out.printf("Congrats! You have found matching elements - %s!%n", element1);
                } else {
                    System.out.println("Try again!");
                }
            }

            if (numbers.isEmpty()) {
                isWon = true;
                break;

            }
            input = scanner.nextLine();
        }
        if (isWon){
            System.out.printf("You have won in %d turns!%n", count);
        }else {
            System.out.println("Sorry you lose :(");
            for (String number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
