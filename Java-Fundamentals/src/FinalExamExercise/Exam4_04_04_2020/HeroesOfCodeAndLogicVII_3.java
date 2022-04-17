package FinalExamExercise.Exam4_04_04_2020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> heroHP = new LinkedHashMap<>();
        Map<String, Integer> heroMP = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String hero = input[0];
            int HP = Integer.parseInt(input[1]);
            int MP = Integer.parseInt(input[2]);
            if (HP > 100) {
                HP = 100;
            }
            heroHP.put(hero, HP);
            if (MP > 200) {
                MP = 200;
            }
            heroMP.put(hero, MP);
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] token = input.split(" - ");
            String command = token[0];
            String hero = token[1];

            if (command.equals("CastSpell")) {
                int neededMP = Integer.parseInt(token[2]);
                String spellName = token[3];
                if (heroMP.get(hero) >= neededMP) {
                    int leftMP = heroMP.get(hero) - neededMP;
                    heroMP.put(hero, leftMP);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spellName, leftMP);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", hero, spellName);
                }

            } else if (command.equals("TakeDamage")) {
                int damage = Integer.parseInt(token[2]);
                String attacker = token[3];
                int reduceHP = heroHP.get(hero) - damage;
                if (reduceHP > 0) {
                    heroHP.put(hero, reduceHP);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero, damage, attacker, reduceHP);
                } else {
                    System.out.printf("%s has been killed by %s!%n", hero, attacker);
                    heroHP.remove(hero);
                    heroMP.remove(hero);
                }
            } else if (command.equals("Recharge")) {
                int amount = Integer.parseInt(token[2]);
                int currentMp = heroMP.get(hero);
                int increaseMp = currentMp + amount;
                if (increaseMp > 200) {
                    increaseMp = 200;
                }
                heroMP.put(hero, increaseMp);
                System.out.printf("%s recharged for %d MP!%n", hero, increaseMp - currentMp);


            } else if (command.equals("Heal")) {
                int amount = Integer.parseInt(token[2]);
                int currentHp = heroHP.get(hero);
                int increaseHp = currentHp + amount;
                if (increaseHp > 100) {
                    increaseHp = 100;
                }
                heroHP.put(hero, increaseHp);
                System.out.printf("%s healed for %d HP!%n", hero, increaseHp - currentHp);
            }

            input = scanner.nextLine();
        }
        heroHP.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).
                forEach(h -> {
                    System.out.println(h.getKey());
                    System.out.println("  HP: " + h.getValue());
                    System.out.println("  MP: " + heroMP.get(h.getKey()));
                });
    }
}

