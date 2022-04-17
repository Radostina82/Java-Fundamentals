package List.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] token = input.split("\\s+");
            String command = token[0];

            if (command.equals("merge")) {
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > list.size() - 1) {
                    endIndex = list.size() - 1;
                }
                int counter = startIndex;

                for (int i = startIndex; i < endIndex; i++) {
                    String result = list.get(counter) + list.get(counter + 1);
                    list.set(startIndex, result);
                    list.remove(counter + 1);
                }
            } else if (command.equals("divide")) {
                int index = Integer.parseInt(token[1]);
                int partitions = Integer.parseInt(token[2]);

                // if (index >= 0 && index <= list.size() - 1 && partitions >= 0 && partitions <= 100) {
                String element = list.get(index);
                List<String> newList = new ArrayList<>();

                if (element.length() % partitions == 0) {
                    int portionLengt = element.length() / partitions;
                    int count = 0;
                    for (int i = 0; i < partitions; i++) {
                        StringBuilder result = new StringBuilder();

                        for (int j = 0; j <= portionLengt - 1; j++) {
                            char symbol = element.charAt(count);
                            result.append(symbol);
                            count++;
                        }
                        String newResult = result.toString();
                        newList.add(newResult);
                    }
                } else {
                    int portionLengt = element.length() / partitions;
                   // int finalSubstring = element.length() % partitions;
                    int count = 0;

                    for (int i = 0; i < partitions; i++) {
                        StringBuilder result = new StringBuilder();

                        if (i == partitions - 1) {

                            for (int j = count; j <= element.length() - 1; j++) {
                                char symbol = element.charAt(count);
                                result.append(symbol);
                                count++;
                            }
                            String substring = result.toString();
                            newList.add(substring);
                        } else {
                            for (int j = 0; j <= portionLengt - 1; j++) {
                                char symbol = element.charAt(count);
                                result.append(symbol);
                                count++;
                            }

                            String substring = result.toString();
                            newList.add(substring);
                        }
                    }
                }
                list.remove(index);
                list.addAll(index, newList);
            }
            input = scanner.nextLine();
        }

        for (String result : list) {
            System.out.print(result + " ");
        }
    }


}
