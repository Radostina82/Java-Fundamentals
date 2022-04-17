package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        while (!numbers.isEmpty()) {

            int index = Integer.parseInt(scanner.nextLine());
            int removeElement = 0;

            if (index < 0) {
                removeElement = numbers.remove(0);
                sum += removeElement;
                numbers.add(0, numbers.get(numbers.size() - 1));

            } else if (index > numbers.size() - 1) {
                removeElement = numbers.remove(numbers.size() - 1);
                sum += removeElement;
                numbers.add(numbers.get(0));

            } else {
                removeElement = numbers.remove(index);
                sum += removeElement;

            }
            /*for (int i = 0; i <= numbers.size() - 1; i++) {

               // int element = numbers.get(i);
                if (numbers.get(i) <= removeElement) {
                    numbers.set(i, numbers.get(i) + removeElement);
                } else {
                    numbers.set(i, numbers.get(i) - removeElement);
                }
            }*/

            newList(numbers, removeElement);
        }

        System.out.println(sum);
    }

    private static List<Integer> newList(List<Integer> numbers, int removeElement) {
        for (int i = 0; i <= numbers.size() - 1; i++) {

            int element = numbers.get(i);
            if (element <= removeElement) {
                numbers.set(i, element + removeElement);
            } else {
                numbers.set(i, element - removeElement);
            }
        }
        return numbers;
    }
}
