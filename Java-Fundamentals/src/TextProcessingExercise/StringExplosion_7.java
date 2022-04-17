package TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringExplosion_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> characterList = new ArrayList<>();
        int count = 0;
        int strength = 0;//това ми е силата
        for (int i = 0; i <= input.length() - 1; i++) {
            char symbol = input.charAt(i);
            characterList.add(symbol);
            if ( symbol == '>') {
                i++;
                strength = input.charAt(i) - '0';
                int j = i;
                for ( ;j < i + strength && j <= input.length() - 1; j++) {

                    if (input.charAt(j) == '>') {
                        characterList.add(input.charAt(j));
                        j++;
                        strength += (input.charAt(j) - '0') + 1;
                    }
                }
                i=j-1;
            }
        }
        for (Character character : characterList) {
            System.out.print(character);
        }

    }
}
