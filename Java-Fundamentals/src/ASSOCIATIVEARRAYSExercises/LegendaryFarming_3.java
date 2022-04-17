package ASSOCIATIVEARRAYSExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        Map<String, Integer> junk = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        String winner = "";

        while (winner.equals("")) {
            String[] input = scanner.nextLine().split("\\s+");
            int count = 0;
            int countMaterials = 0;
            for (String element : input) {
                count++;
                if (count % 2 != 0) {
                    countMaterials = Integer.parseInt(element);
                } else {
                    if (keyMaterials.containsKey(element.toLowerCase())) {
                        keyMaterials.put(element.toLowerCase(), keyMaterials.get(element.toLowerCase()) + countMaterials);
                        if (keyMaterials.get(element.toLowerCase()) >= 250) {
                            if (element.toLowerCase().equals("shards")) {
                                winner = "Shadowmourne";
                                keyMaterials.put(element.toLowerCase(), keyMaterials.get(element.toLowerCase()) - 250);
                                break;
                            } else if (element.toLowerCase().equals("fragments")) {
                                winner = "Valanyr";
                                keyMaterials.put(element.toLowerCase(), keyMaterials.get(element.toLowerCase()) - 250);
                                break;
                            } else if (element.toLowerCase().equals("motes")) {
                                winner = "Dragonwrath";
                                keyMaterials.put(element.toLowerCase(), keyMaterials.get(element.toLowerCase()) - 250);
                                break;
                            }
                    } }else {
                        if (!junk.containsKey(element.toLowerCase())) {
                            junk.put(element.toLowerCase(), countMaterials);
                        } else {
                            junk.put(element.toLowerCase(), junk.get(element.toLowerCase()) + countMaterials);
                        }
                    }
                }
            }
        }
        System.out.printf("%s obtained!%n", winner);
        keyMaterials.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.<String, Integer>comparingByKey())).forEach(n -> System.out.println(n.getKey() + ": " + n.getValue()));
        junk.entrySet().stream().sorted((n1, n2) -> n1.getKey().compareTo(n2.getKey()))
                .forEach(n -> System.out.println(n.getKey() + ": " + n.getValue()));
    }
}
