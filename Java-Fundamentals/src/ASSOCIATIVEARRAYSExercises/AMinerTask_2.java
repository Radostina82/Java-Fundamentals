package ASSOCIATIVEARRAYSExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countInput = 0;

        Map<String, Integer> resources = new LinkedHashMap<>();
        String resource = "";
        int quantity = 0;

        while (!input.equals("stop")){
            countInput++;
            if (countInput%2!=0){
                resource = input;
                if (!resources.containsKey(resource)){
                    resources.put(resource, 0);
                }
            }else{
                quantity = Integer.parseInt(input);
                resources.put(resource, resources.get(resource)+quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
