package RegularExpressionsExercises;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");

        Map<String, double[]> demons = new TreeMap<>();

        for (int i = 0; i <= input.length - 1; i++) {
            String nameDemon = input[i].replaceAll(" ", "");
            double health = 0.0;
            double damage = 0.0;

            health = getHealt(nameDemon, health);
            damage = getDamage(nameDemon, damage);
            demons.put(nameDemon, new double[]{health, damage});
        }
        for (Map.Entry<String, double[]> entry : demons.entrySet()) {
            String name = entry.getKey();
            double[]value = entry.getValue();
            int health = (int) value[0];
            double damage = value[1];
            System.out.printf("%s - %d health, %.2f damage%n", name, health, damage);

        }
    }

    private static double getDamage(String nameDemon, double damage) {
        String regexDNumber = "[+-]*([0-9]+\\.?[0-9]*)";
        Pattern patternNumber = Pattern.compile(regexDNumber);
        Matcher matcherNumber = patternNumber.matcher(nameDemon);
        while (matcherNumber.find()) {
            damage += Double.parseDouble(matcherNumber.group());
        }
        int multipliersCount = nameDemon.replaceAll("[^*]", "").length();
        int divisorSCount = nameDemon.replaceAll("[^/]", "").length();

        if (multipliersCount>divisorSCount){
            for (int i = 1; i <= multipliersCount-divisorSCount ; i++) {
                damage *= 2;
            }
        }else{
            for (int i = 1; i <= divisorSCount-multipliersCount ; i++) {
                damage/=2;
            }
        }
        return damage;
    }


    private static double getHealt(String nameDemon, double health) {

        for (int i = 0; i <= nameDemon.length() - 1; i++) {
            char currentSymbol = nameDemon.charAt(i);
            if (!Character.isDigit(currentSymbol) && currentSymbol != '+' && currentSymbol != '-' && currentSymbol != '*' && currentSymbol != '/' && currentSymbol!='.') {
                health += currentSymbol;
            }
        }
        return health;
    }
}
