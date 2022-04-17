package ASSOCIATIVEARRAYSMoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Snowwhite_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> dwarfsList = new LinkedHashMap<>();
        while (!input.equals("Once upon a time")){
            //Pesho <:> Red <:> 2000physics
            //{dwarfName} <:> {dwarfHatColor} <:> {dwarfPhysics}

            String name = input.split(" <:> ")[0];
            String hatColor = input.split(" <:> ")[1];
            int physics = Integer.parseInt(input.split(" <:> ")[2]);

            if (!dwarfsList.containsKey(hatColor)){
                dwarfsList.put(hatColor, new LinkedHashMap<>());
                dwarfsList.get(hatColor).put(name, physics);
            }else{
                if (!dwarfsList.get(hatColor).containsKey(name)){
                    dwarfsList.get(hatColor).put(name,physics );
                }else{
                    if (dwarfsList.get(hatColor).get(name)<physics){
                        dwarfsList.get(hatColor).put(name, physics);
                    }
                }
            }

            input = scanner.nextLine();
        }

        Map<String, Integer> print = new LinkedHashMap<>();
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : dwarfsList.entrySet()) {
            for(Map.Entry<String, Integer> subEntry : entry.getValue().entrySet()) {
                print.put(entry.getKey() + " " + subEntry.getKey() + " " + entry.getValue().size(), subEntry.getValue());
            }
        }
        print.entrySet().stream().sorted((pair2, pair1) -> {
            int sort = Integer.compare(pair1.getValue(), pair2.getValue());
            if (sort == 0) {
                String[] sort1 = pair1.getKey().split(" ");
                String[] sort2 = pair2.getKey().split(" ");
                sort = sort1[2].compareTo(sort2[2]);
            }
            return sort;
        }).forEach(pair -> {
            String[] printing = pair.getKey().split(" ");
            System.out.printf("(%s) %s <-> %d\n", printing[0], printing[1], pair.getValue());
        });
    }
}
