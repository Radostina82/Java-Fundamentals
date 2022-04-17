package ASSOCIATIVEARRAYSExercises;

import java.sql.SQLOutput;
import java.util.*;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> result = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String name = input.split("-")[0];
            String language = input.split("-")[1];

            if (!language.equals("banned")) {
                int points = Integer.parseInt(input.split("-")[2]);
                if (!result.containsKey(name)) {
                    result.put(name, points);
                } else {
                    if (result.get(name) < points) {
                        result.put(name, points);
                    }
                }
                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    submissions.put(language, submissions.get(language) + 1);
                }
            } else {
                result.remove(name);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        result.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).
                forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
        System.out.println("Submissions:");
        submissions.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).
                forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
