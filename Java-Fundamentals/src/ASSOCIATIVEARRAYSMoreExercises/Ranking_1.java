package ASSOCIATIVEARRAYSMoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ranking_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contests = scanner.nextLine();

        Map<String, String> contest = new LinkedHashMap<>();

        while (!contests.equals("end of contests")){
            String course = contests.split(":")[0];
            String password = contests.split(":")[1];

            contest.put(course, password);

            contests = scanner.nextLine();
        }

        String submissions = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        while (!submissions.equals("end of submissions")){
            String course = submissions.split("=>")[0];
            String pass = submissions.split("=>")[1];
            String user = submissions.split("=>")[2];
            int point = Integer.parseInt(submissions.split("=>")[3]);

            if (contest.containsKey(course) && contest.get(course).contains(pass)){
                if (!users.containsKey(user)){
                    users.put(user, new LinkedHashMap<>());
                    users.get(user).put(course, point);
                }else {
                    if (!users.get(user).containsKey(course)){
                        users.get(user).put(course, point);
                    }else{
                        if (users.get(user).get(course) < point){
                            users.get(user).put(course, point);
                        }
                    }
                }
            }

            submissions=scanner.nextLine();
        }
        int sumTotal = 0;

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : users.entrySet()) {
           int sum = entry.getValue().values().stream().mapToInt(e->e).sum();
            if (sum > sumTotal){
                sumTotal = sum;
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : users.entrySet()) {
            if (entry.getValue().values().stream().mapToInt(e->e).sum() == sumTotal){
                System.out.printf("Best candidate is %s with total %d points.%n", entry.getKey(), sumTotal);
            }
        }
        System.out.println("Ranking:");
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : users.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().entrySet().stream().sorted((e1,e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(e-> System.out.printf("#  %s -> %d%n", e.getKey(), e.getValue()));
        }
    }
}
