package ASSOCIATIVEARRAYSExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        Map<String, String> list = new LinkedHashMap<>();

        for (int i = 1; i <= count ; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            String command = input[0];

            if (command.equals("register")){
                String username = input[1];
                String licensePlateNumber = input[2];

                if (!list.containsKey(username)){
                    list.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber );
                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n", list.get(username));
                }

            }else if(command.equals("unregister")){
                String username = input[1];
                if (!list.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n", username);
                }else{
                    System.out.printf("%s unregistered successfully%n", username);
                    list.remove(username);
                }
            }
        }
        for (Map.Entry<String, String> entry : list.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
