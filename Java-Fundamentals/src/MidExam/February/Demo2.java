package MidExam.February;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            if (command.equals("reverse")) {
                int startIndex = Integer.parseInt(input.split(" ")[2]);
                int count = Integer.parseInt(input.split(" ")[4]);
                int endIndex = startIndex + count - 1;

                int counter = 0;
                for (int i = 1; i < count; i++) {
                    int element = numbers.get(startIndex);
                    numbers.remove(startIndex);
                    numbers.add(endIndex - counter, element);
                    counter++;
                }

            } else if (command.equals("sort")) {
                int startIndex = Integer.parseInt(input.split(" ")[2]);
                int count = Integer.parseInt(input.split(" ")[4]);

                int endIndex = startIndex + count - 1;
                List<Integer> n = new ArrayList<>();
                int counter = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    n.add(numbers.get(i));
                    numbers.remove(i);
                    i--;
                    counter++;
                    if (counter == count) {
                        break;
                    }
                }
                Collections.sort(n);
                Collections.reverse(n);
                for (int i = 0; i <= n.size() - 1; i++) {
                    numbers.add(startIndex, n.get(i));
                    n.remove(i);
                    i--;
                }


            } else if (command.equals("remove")) {
                int count = Integer.parseInt(input.split(" ")[1]);
                for (int i = 0; i < count; i++) {
                    numbers.remove(numbers.get(0));
                }

            }
            input = scanner.nextLine();
        }

        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
                break;
            } else {
                System.out.print(numbers.get(i) + "," + " ");
            }
        }
    }
}

