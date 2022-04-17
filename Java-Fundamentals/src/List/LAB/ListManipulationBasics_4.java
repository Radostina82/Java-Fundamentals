package List.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            String firstCommand = command[0];
            if (firstCommand.equals("Add")){
                addNumber(number, command);
            }else if (firstCommand.equals("Remove")){
                removeNumber(number, command);
            }else if (firstCommand.equals("RemoveAt")){
                removeAtNumber(number, command);
            }else if (firstCommand.equals("Insert")){
                insertNumber(number, command);
            }
            input = scanner.nextLine();
        }
        printList(number);
    }

    private static void printList(List<Integer> number) {
        for (int num: number) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> addNumber(List<Integer> number, String[] command) {
        String secondCommand = command[1];
        number.add(Integer.parseInt(secondCommand));
        return number;
    }

    private static List<Integer> removeNumber(List<Integer> number, String[] command) {
        String secondCommand = command[1];
        number.remove((Object)Integer.parseInt(secondCommand));
        return number;
    }

    private static List<Integer> removeAtNumber(List<Integer> number, String[] command) {
        String secondCommand = command[1];
        int index = Integer.parseInt(secondCommand);
        number.remove(index);
        return number;
    }

    private static List<Integer> insertNumber(List<Integer> number, String[] command) {
        String firstCommand = command[1];
        String secondCommand = command[2];
        int num = Integer.parseInt(firstCommand);
        int index = Integer.parseInt(secondCommand);
        number.add(index, num);
        return number;
    }
}
