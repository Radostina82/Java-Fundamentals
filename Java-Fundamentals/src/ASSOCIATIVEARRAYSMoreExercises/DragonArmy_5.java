package ASSOCIATIVEARRAYSMoreExercises;

import java.sql.DataTruncation;
import java.util.*;

public class DragonArmy_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, TreeMap<String, List<Integer>>> dragonList = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String color = input[0];
            String nameDragon = input[1];
            int damage = Integer.parseInt(getDamage(input));
            int health = Integer.parseInt(getHealth(input));
            int armor = Integer.parseInt(getArmor(input));

            dragonList.putIfAbsent(color, new TreeMap<>());
            Map<String, List<Integer>> dragonNames = new TreeMap<>();

            dragonNames.put(nameDragon, Arrays.asList(0, 0, 0));


            dragonNames.get(nameDragon).set(0, damage);
            dragonNames.get(nameDragon).set(1, health);
            dragonNames.get(nameDragon).set(2, armor);
            dragonList.get(color).putAll(dragonNames);
        }

        for (Map.Entry<String, TreeMap<String, List<Integer>>> entry : dragonList.entrySet()) {
            TreeMap<String, List<Integer>> dragons = entry.getValue();
            double avDamage = 0.0;
            double avHealth = 0.0;
            double avArmor = 0.0;
            int count = 0;

            for (Map.Entry<String, List<Integer>> listEntry : dragons.entrySet()) {
                List<Integer> list = listEntry.getValue();
                avDamage += list.get(0);
                avHealth += list.get(1);
                avArmor += list.get(2);
                count++;
            }
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", entry.getKey(), avDamage * 1.0 / count, avHealth * 1.0 / count, avArmor * 1.0 / count);
            for (Map.Entry<String, List<Integer>> listEntry : dragons.entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", listEntry.getKey(), listEntry.getValue().get(0),
                        listEntry.getValue().get(1), listEntry.getValue().get(2));
            }
        }
    }

    private static String getArmor(String[] input) {
        String defaultArmor = "";
        if (input[4].equals("null")) {
            defaultArmor = "10";
        } else {
            defaultArmor = input[4];
        }
        return defaultArmor;
    }

    private static String getHealth(String[] input) {
        String defaultHealth = "";
        if (input[3].equals("null")) {
            defaultHealth = "250";
        } else {
            defaultHealth = input[3];
        }
        return defaultHealth;
    }

    private static String getDamage(String[] input) {
        String defaultDamage = "";
        if (input[2].equals("null")) {
            defaultDamage = "45";
        } else {
            defaultDamage = input[2];
        }
        return defaultDamage;
    }
}
