package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        while (firstPlayer.size() > 0 && secondPlayer.size() > 0) {

            int elementFirstPlayer = firstPlayer.remove(0);
            int elementSecondPlayer = secondPlayer.remove(0);

            if (elementFirstPlayer > elementSecondPlayer) {
                firstPlayer.add(elementFirstPlayer);
                firstPlayer.add(elementSecondPlayer);
            } else if (elementSecondPlayer > elementFirstPlayer) {
                secondPlayer.add(elementSecondPlayer);
                secondPlayer.add(elementFirstPlayer);
            }
        }
        if (firstPlayer.size() > secondPlayer.size()) {
            sumAndPrint(firstPlayer, "First");
        } else {
            sumAndPrint(secondPlayer, "Second");
        }
    }

    private static void sumAndPrint(List<Integer> win, String player) {
        int sum = 0;
        for (int element : win) {
            sum += element;
        }
        System.out.printf("%s player wins! Sum: %d", player, sum);
    }
}
