package ASSOCIATIVEARRAYSMoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MOBAChallenger_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> playersList = new LinkedHashMap<>();

        while (!input.equals("Season end")) {
            //Pesho -> Adc -> 400
            //"{player} -> {position} -> {skill}"
            //"{player} vs {player}"
            if (input.contains("->")) {
                String player = input.split(" -> ")[0];
                String position = input.split(" -> ")[1];
                int point = Integer.parseInt(input.split(" -> ")[2]);

                if (!playersList.containsKey(player)) {
                    playersList.put(player, new LinkedHashMap<>());
                    playersList.get(player).put(position, point);
                } else if (!playersList.get(player).containsKey(position)) {
                    playersList.get(player).put(position, point);
                } else {
                    if (playersList.get(player).get(position) < point) {
                        playersList.get(player).put(position, point);
                    }
                }
            } else if (input.contains("vs")) {
                String player1 = input.split("\\s+")[0];
                String player2 = input.split("\\s+")[2];

                if (playersList.containsKey(player1) && playersList.containsKey(player2)) {

                    boolean isEqual = false;

                    for (String s : playersList.get(player1).keySet()) {
                        for (String s1 : playersList.get(player2).keySet()) {
                            if (s.equals(s1)) {
                                isEqual = true;
                            }
                        }
                    }
                    if (isEqual){
                        if (playersList.get(player1).values().stream().mapToInt(e->e).sum()>playersList.get(player2).values().stream().mapToInt(e->e).sum()){
                            playersList.remove(player2);
                        }else if (playersList.get(player1).values().stream().mapToInt(e->e).sum()<playersList.get(player2).values().stream().mapToInt(e->e).sum()){
                            playersList.remove(player1);
                        }
                    }
                }
            }


            input = scanner.nextLine();
        }
        playersList.entrySet().stream().sorted((e1,e2)->{
            int res = Integer.compare(e2.getValue().values().stream().mapToInt(i->i).sum(), e1.getValue().values().stream().mapToInt(i->i).sum());
            if (res==0){
                res = e2.getKey().compareTo(e1.getKey());
            }
                return res;
        }).forEach(e->{
            System.out.printf("%s: %d skill%n", e.getKey(), e.getValue().values().stream().mapToInt(i->i).sum());
            e.getValue().entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).
                    forEach(p-> {
                        System.out.printf("- %s <::> %d%n", p.getKey(), p.getValue());

                    });
        });
    }
}
