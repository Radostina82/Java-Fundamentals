package TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i <= input.length()-1 ; i++) {
            char symbol = input.toLowerCase().charAt(i);
            characterList.add(symbol);
            }
        for (int i = 0; i < characterList.size()-1; i++) {
            char symbol = characterList.get(i);
            char currentSymbol = characterList.get(i+1);
            if (symbol == currentSymbol){
                characterList.remove(i+1);
                i--;
        }
        }
        for (Character character : characterList) {
            System.out.print(character);
        }
    }
}
