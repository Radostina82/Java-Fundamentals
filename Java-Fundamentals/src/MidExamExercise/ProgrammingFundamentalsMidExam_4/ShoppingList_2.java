package MidExamExercise.ProgrammingFundamentalsMidExam_4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String command = input.split("\\s+")[0];

            if (command.equals("Urgent")) {
                String item = input.split("\\s+")[1];
                if (!list.contains(item)) {
                    list.add(0, item);
                }
            } else if (command.equals("Unnecessary")) {
                String item = input.split("\\s+")[1];
                if (list.contains(item)) {
                    list.remove(item);
                }
            } else if (command.equals("Correct")) {
                String oldItem = input.split("\\s+")[1];
                String newItem = input.split("\\s+")[2];
                if (list.contains(oldItem)) {
                    int index = list.indexOf(oldItem);
                    list.set(index, newItem);
                }

            } else if (command.equals("Rearrange")) {
                String item = input.split("\\s+")[1];
                if (list.contains(item)) {
                    list.remove(item);
                    list.add(item);
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= list.size() - 1; i++) {
            String element = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(element);
                break;
            } else {
                System.out.print(element + "," + " ");
            }
        }


    }
}
