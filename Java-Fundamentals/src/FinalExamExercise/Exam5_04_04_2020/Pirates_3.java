package FinalExamExercise.Exam5_04_04_2020;

import java.util.*;

public class Pirates_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<Integer>> listCities = new TreeMap<>();

        while (!input.equals("Sail")) {
            //Tortuga||345000||1250
            String[] token = input.split("\\|\\|");
            String cities = token[0];
            int population = Integer.parseInt(token[1]);
            int gold = Integer.parseInt(token[2]);

            if (!listCities.containsKey(cities)) {
                listCities.put(cities, new ArrayList<>());
                listCities.get(cities).add(0, population);
                listCities.get(cities).add(1, gold);
            } else {
                listCities.get(cities).set(0, listCities.get(cities).get(0) + population);
                listCities.get(cities).set(1, listCities.get(cities).get(1) + gold);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] token = input.split("=>");
            String command = token[0];
            String cities = token[1];

            if (command.equals("Plunder")) {
                int people = Integer.parseInt(token[2]);
                int gold = Integer.parseInt(token[3]);
                int remainingPeople = listCities.get(cities).get(0) - people;
                int remainingGold = listCities.get(cities).get(1) - gold;


                if (remainingGold<=0 || remainingPeople<=0){
                    if(remainingGold<=0){
                        gold = listCities.get(cities).get(1);
                    }
                    if (remainingPeople<=0){
                        people = listCities.get(cities).get(0);
                    }
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cities, gold, people);
                    System.out.println(cities + " has been wiped off the map!");
                    listCities.remove(cities);
                }else {
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cities, gold, people);
                    listCities.get(cities).add(0, remainingPeople);
                    listCities.get(cities).add(1, remainingGold);
                }
            } else if (command.equals("Prosper")) {
                int gold = Integer.parseInt(token[2]);

                if (gold<0){
                    System.out.println("Gold added cannot be a negative number!");
                }else{
                    listCities.get(cities).set(1, listCities.get(cities).get(1) + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, cities, listCities.get(cities).get(1));
                }
            }

            input = scanner.nextLine();
        }
        if (listCities.size()>0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", listCities.size());
            listCities.entrySet().stream().sorted((e1, e2)-> e2.getValue().get(1).compareTo(e1.getValue().get(1))).
                    forEach(cities -> {
                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", cities.getKey(), cities.getValue().get(0), cities.getValue().get(1));
                    });
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
