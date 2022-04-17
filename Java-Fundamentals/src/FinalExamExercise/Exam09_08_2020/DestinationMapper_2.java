package FinalExamExercise.Exam09_08_2020;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([=\\/])(?<places>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int points = 0;

        while (matcher.find()){
            String locations = matcher.group("places");
            destinations.add(locations);
            points += locations.length();
        }
        System.out.print("Destinations: ");
        for (int i = 0; i <= destinations.size()-1 ; i++) {
            String element = destinations.get(i);
            if (i==destinations.size()-1){
                System.out.print(element);
                break;
            }
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.printf("Travel Points: %d", points);
    }
}
