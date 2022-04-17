package ASSOCIATIVEARRAYSLab;

import java.util.*;

public class WordSynonyms_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!words.containsKey(word)){
                List<String> synonymsForCurrentWord = new ArrayList<>();
                synonymsForCurrentWord.add(synonym);
                words.put(word, synonymsForCurrentWord);
            }else{
                List<String> synonymsForCurrentWord = words.get(word);
                synonymsForCurrentWord.add(synonym);
                words.put(word, synonymsForCurrentWord);
            }

            //words.putIfAbsent(word, new ArrayList<>()); ако думата не съществува добавяме я заедно с нов лист
            //  words.get(word).add(synonym); ако думата я има мапа взема списъка със синоними на думата и добавям новия синоним
        }
        for (Map.Entry<String, List<String>> stringListEntry : words.entrySet()) {
            System.out.printf("%s - %s%n", stringListEntry.getKey(), String.join(", ", stringListEntry.getValue()));
        }
    }
}
