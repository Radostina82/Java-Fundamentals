package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        String nameRegex = "[A-Za-z]+";
        String digitRegex = "[0-9]";
        Pattern patternName = Pattern.compile(nameRegex);
        Pattern patternDigit = Pattern.compile(digitRegex);
        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        participants.forEach(e-> racersDistances.put(e, 0));

        while (!input.equals("end of race")){
            Matcher matcherName = patternName.matcher(input);
            StringBuilder name = new StringBuilder();
            while (matcherName.find()){
                name.append(matcherName.group());
            }
            String nameRacer = name.toString();

            if (racersDistances.containsKey(nameRacer)){
                int sum = 0;
                Matcher matcherDigit = patternDigit.matcher(input);
                while (matcherDigit.find()){
                    int digit = Integer.parseInt(matcherDigit.group());
                    sum+=digit;
                }
                racersDistances.put(nameRacer, racersDistances.get(nameRacer) + sum);
            }
            input = scanner.nextLine();
        }

        List<String> revers = racersDistances.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("1st place: " + revers.get(0));
        System.out.println("2nd place: " + revers.get(1));
        System.out.println("3rd place: " + revers.get(2));
    }
}
