package FinalExamExercise;

import java.util.*;

public class SantaSNewList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> childCountToy = new TreeMap<>();
        Map<String, Integer> presentsCount = new LinkedHashMap<>();

        while (!input.equals("END")){
            //Marty->Toys->5

            if (input.split("->")[0].equals("Remove")){
                String name = input.split("->")[1];
                childCountToy.remove(name);
            }else{
                String name = input.split("->")[0];
                String present = input.split("->")[1];
                int count = Integer.parseInt(input.split("->")[2]);
                if (!childCountToy.containsKey(name)) {
                    childCountToy.put(name, count);
                }else {
                    childCountToy.put(name, childCountToy.get(name) + count);
                }
                if (!presentsCount.containsKey(present)){
                    presentsCount.putIfAbsent(present, count);
                }else {

                    presentsCount.put(present, presentsCount.get(present) + count);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Children:");
        childCountToy.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).
                forEach(e-> System.out.printf("%s -> %d%n", e.getKey(), e.getValue()));
        System.out.println("Presents:");
        presentsCount.entrySet().forEach(e-> System.out.printf("%s -> %d%n",e.getKey(), e.getValue() ));
    }
}
