package FinalExamExercise.Exam09_08_2020;

import java.util.*;
import java.util.stream.Stream;

public class PlantDiscovery_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
      Map<String, Integer> listPlants = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);
            plantsRating.putIfAbsent(plant, new ArrayList<>());
            listPlants.put(plant, rarity);
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] token = input.split("\\s+");
            String command = token[0];
//Rate: Woodii - 10
            if (command.equals("Rate:")) {
                String plant = token[1];
                double rating = Double.parseDouble(token[3]);

                if (listPlants.containsKey(plant)) {
                    if (!plantsRating.containsKey(plant)) {
                        plantsRating.put(plant, new ArrayList<>());
                    }
                    plantsRating.get(plant).add(rating);
                } else {
                    System.out.println("error");
                }

            } else if (command.equals("Update:")) {
                String plant = token[1];
                int rarity = Integer.parseInt(token[3]);
                if (listPlants.containsKey(plant)) {
                    listPlants.put(plant, rarity);
                } else {
                    System.out.println("error");
                }

            } else if (command.equals("Reset:")) {
                String plant = token[1];
                if (plantsRating.containsKey(plant)) {
                    plantsRating.get(plant).clear();
                } else {
                    System.out.println("error");
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
       listPlants.entrySet().stream().sorted(Map.Entry.<String , Integer>comparingByValue().thenComparingDouble(x-> plantsRating.get(x.getKey()).stream()
               .mapToDouble(Double::doubleValue).average().orElse(0.0)).reversed()).
               forEach(e-> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", e.getKey(), e.getValue(),plantsRating.get(e.getKey()).stream().mapToDouble(Double::doubleValue)
               .average().orElse(0.0)));
    }
}
