package List.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[2];
            String name = input.split("\\s+")[0];
            if (command.equals("going!")) {
                if (names.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                }else{
                    names.add(name);
                }
            }else if (command.equals("not")){
                if (names.contains(name)){
                    names.remove(name);
                }else{
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        printList(names);
    }

    private static void printList(List<String> names) {
        for (String name:names) {
            System.out.println(name);
        }
    }
}
