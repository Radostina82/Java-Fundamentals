package List.Exercise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String firstCommand = command.split("\\s+")[0];
            int element = Integer.parseInt(command.split("\\s+")[1]);

            if (firstCommand.equals("Delete")) {
                number.removeAll(Arrays.asList(element));
            } else if (firstCommand.equals("Insert")) {
                int position = Integer.parseInt(command.split("\\s+")[2]);
                number.add(position, element);
            }
            command = scanner.nextLine();
        }
        printList(number);
    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
