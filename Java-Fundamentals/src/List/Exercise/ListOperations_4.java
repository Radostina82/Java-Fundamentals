package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")){
                String []token = input.split("\\s+");
                String firstCommand = token[0];
                if (firstCommand.equals("Add")){
                    int element = Integer.parseInt(token[1]);
                    listNumber.add(element);
                }else if (firstCommand.equals("Insert")){
                    int element = Integer.parseInt(token[1]);
                    int index = Integer.parseInt(token[2]);
                    if (isValidIndex(index, listNumber.size())) {
                        listNumber.add(index, element);
                    }else{
                        System.out.println("Invalid index");
                    }
                }else if (firstCommand.equals("Remove")){
                    int index = Integer.parseInt(token[1]);
                    if (isValidIndex(index, listNumber.size())) {
                        listNumber.remove(index);
                    }else {
                        System.out.println("Invalid index");
                    }
                }else if (firstCommand.equals("Shift")){
                    String direction = token[1];
                    int count = Integer.parseInt(token[2]);
                    if (direction.equals("left")){
                        for (int i = 1; i <= count ; i++) {
                            int firstNumber = listNumber.get(0);
                            listNumber.remove(0);
                            listNumber.add(firstNumber);
                        }
                    }else if (direction.equals("right")){
                        for (int i = 1; i <= count; i++) {
                            int lastNumber = listNumber.get(listNumber.size()-1);
                            listNumber.remove(listNumber.size()-1);
                            listNumber.add(0,lastNumber);
                        }
                    }
                }

            input=scanner.nextLine();
        }
        printList(listNumber);
    }

    private static boolean isValidIndex(int index, int lenght){
        return index>=0 && index<=lenght;
    }

    private static void printList(List<Integer> listNumber) {
        for (int num:listNumber) {
            System.out.print(num + " ");
        }
    }
}
