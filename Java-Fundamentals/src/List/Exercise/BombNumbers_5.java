package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] input = scanner.nextLine().split("\\s+");
        int bombNumber = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

        int sum = 0;
        while (numbers.contains(bombNumber)){
            int indexBomb = numbers.indexOf(bombNumber);

            int left = Math.max(0, indexBomb - power);//ляво
            int right = Math.min(numbers.size()-1,indexBomb + power);//дясно

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }
        for (int i = 0; i <= numbers.size()-1 ; i++) {
            int element = numbers.get(i);
            sum += element;
        }
        System.out.println(sum);
    }
}
