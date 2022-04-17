package ASSOCIATIVEARRAYSExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> characters = new LinkedHashMap<>();

        for (int i = 0; i <= input.length()-1 ; i++) {
            char currentChar = input.charAt(i);
            if (!characters.containsKey(currentChar) && currentChar != ' '){
                characters.put(currentChar, 1);
            }else if (characters.containsKey(currentChar) && currentChar != ' '){
                characters.put(currentChar, characters.get(currentChar)+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
