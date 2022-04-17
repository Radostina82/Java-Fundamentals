package ASSOCIATIVEARRAYSExercises;

import java.util.*;

public class ForceBook_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> list = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {


            if (input.contains("|")) {
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];
                boolean chek = false;

                for (Map.Entry<String, List<String>> entry : list.entrySet()) {
                    if (entry.getValue().contains(forceUser)){
                        chek = true;
                        break;
                    }
                }
                if (!chek){
                    if (!list.containsKey(forceSide)){
                        list.put(forceSide, new ArrayList<>());
                        list.get(forceSide).add(forceUser);
                    }else if (list.containsKey(forceSide) && !list.get(forceSide).contains(forceUser)){
                        list.get(forceSide).add(forceUser);
                    }
                }

            } else if (input.contains("->")) {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                for (Map.Entry<String, List<String>> entry : list.entrySet()) {
                    if (entry.getValue().contains(forceUser)){
                        list.get(entry.getKey()).remove(forceUser);
                        break;
                    }
                }
                if (!list.containsKey(forceSide)){
                    list.put(forceSide, new ArrayList<>());
                    list.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                }else if (list.containsKey(forceSide) && !list.get(forceSide).contains(forceUser)){
                    list.get(forceSide).add(forceUser);
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                }
            }
            input = scanner.nextLine();
        }
        list.entrySet().stream().filter(e->e.getValue().size()>0).sorted((e1,e2) -> {int res = Integer.compare(e2.getValue().size(), e1.getValue().size());
           if (res == 0) res = e1.getKey().compareTo(e2.getKey()); return res; }).
                forEach(e-> {
                    System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream().sorted(String::compareTo).forEach(n -> System.out.println("! " + n)); });

    }
}