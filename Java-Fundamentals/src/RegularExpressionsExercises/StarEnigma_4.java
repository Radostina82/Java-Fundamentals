package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attack = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();
            int count = getSpecialLetters(input);
            String encryptedMassage = getEncryptedMassage(count, input);

            String regex = "@(?<planet>[A-Za-z]+)[^@!:->]*:(?<population>[0-9]+)[^@!:->]*!(?<typeattack>[AD])![^@!:->]*->(?<countsoldier>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(encryptedMassage);

            while (matcher.find()){
                String planet = matcher.group("planet");
                String attackPlanet = matcher.group("typeattack");

                if (attackPlanet.equals("A")){
                    attack.add(planet);
                }else if (attackPlanet.equals("D")){
                    destroyed.add(planet);
                }
            }

        }
        printOutput(attack, destroyed);
    }

    private static void printOutput(List<String> attack, List<String> destroyed) {
        Collections.sort(attack);
        Collections.sort(destroyed);

        System.out.println("Attacked planets: " + attack.size());
        if (!attack.isEmpty()){
         attack.forEach(e-> System.out.println("-> " + e));
        }
        System.out.println("Destroyed planets: " + destroyed.size());
        if (!destroyed.isEmpty()){
            destroyed.forEach(e-> System.out.println("-> " + e));

        }
    }

    private static String getEncryptedMassage(int count, String input) {
        StringBuilder encryptedMassage = new StringBuilder();
        for (int j = 0; j <=input.length()-1 ; j++) {
            char currentChar = input.charAt(j);
            char element = (char) (currentChar - count);
            encryptedMassage.append(element);
        }
       return encryptedMassage.toString();
    }

    private static int getSpecialLetters(String input) {
        String regex = "[SsTtAaRr]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
