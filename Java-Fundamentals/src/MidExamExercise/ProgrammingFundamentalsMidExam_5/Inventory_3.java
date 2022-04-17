package MidExamExercise.ProgrammingFundamentalsMidExam_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] input1 = input.split("\\s+");
            String token = input1[0];

            if (token.equals("Collect")) {
                String item = input1[2];

                if (!items.contains(item)) {
                    items.add(item);
                }

            } else if (token.equals("Drop")) {
                String item = input1[2];
                if (items.contains(item)) {
                    items.remove(item);
                }
            } else if (token.equals("Combine")) {
                String item = input.split("\\s+")[3];
                String oldItem = item.split(":")[0];
                String newItem = item.split(":")[1];

                if (items.contains(oldItem)) {
                    int index = items.indexOf(oldItem);
                    items.add(index + 1, newItem);
                }
            } else if (token.equals("Renew")) {
                String item = input1[2];
                if (items.contains(item)) {
                    items.remove(item);
                    items.add(item);
                }
            }


            input = scanner.nextLine();
        }
        for (int i = 0; i<= items.size()-1 ; i++) {
            String element = items.get(i);
            if (i == items.size()-1){
                System.out.print(element);
                break;
            }
            System.out.print(element + "," + " ");
        }
    }
}
