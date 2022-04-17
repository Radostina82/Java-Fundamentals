package ASSOCIATIVEARRAYSMoreExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> judge = new LinkedHashMap<>();

        while (!input.equals("no more time")){
            String user = input.split(" -> ")[0];
            String contest = input.split(" -> ")[1];
            int point = Integer.parseInt(input.split(" -> ")[2]);

            if (!judge.containsKey(contest)){
                judge.put(contest, new LinkedHashMap<>());
                judge.get(contest).put(user, point);
            }else{
                if (!judge.get(contest).containsKey(user)){
                    judge.get(contest).put(user, point);
                }else {
                    if (judge.get(contest).get(user) < point){
                        judge.get(contest).put(user, point);
                    }
                }
            }

            input = scanner.nextLine();
        }
        AtomicInteger num = new AtomicInteger();
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : judge.entrySet()) {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());
            num.set(0);
            entry.getValue().entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).
                    forEach(e->{

                        System.out.printf("%d. %s <::> %d%n", num.incrementAndGet(), e.getKey(), e.getValue());
                    });

        }
        System.out.println("Individual standings:");
        Map<String, Integer> list = new LinkedHashMap<>();

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : judge.entrySet()) {
            for (Map.Entry<String, Integer> entry : user.getValue().entrySet()) {
                list.putIfAbsent(entry.getKey(), 0);
                    list.put(entry.getKey(), list.get(entry.getKey()) + entry.getValue());
            }

        }
        num.set(0);
        list.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(e->{
                    int count = 0;
                    System.out.printf("%d. %s -> %d%n", num.incrementAndGet(), e.getKey(), e.getValue());
                });
    }
}
