package FinalExamExercise.Exam15_08_2020;

import java.util.*;

public class ThePianist_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> list = new TreeMap<>();

        for (int i = 1; i <=n ; i++) {
        String [] input = scanner.nextLine().split("\\|");
        String piece = input[0];
        String composer = input[1];
        String key = input[2];

        list.put(piece, new ArrayList<>());
        list.get(piece).add(0,composer);
        list.get(piece).add(1,key);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String command = input.split("\\|")[0];

            if (command.equals("Add")){
                String piece = input.split("\\|")[1];
                String composer = input.split("\\|")[2];
                String key = input.split("\\|")[3];
                if (!list.containsKey(piece)){
                    list.put(piece, new ArrayList<>());
                    list.get(piece).add(0,composer);
                    list.get(piece).add(1,key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }else{
                    System.out.printf("%s is already in the collection!%n", piece);
                }
            }else if (command.equals("Remove")){
                String piece = input.split("\\|")[1];
                if (list.containsKey(piece)){
                    list.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            }else if (command.equals("ChangeKey")){
                String piece = input.split("\\|")[1];
                String key = input.split("\\|")[2];
                if (list.containsKey(piece)){
                    list.get(piece).add(1, key);
                    System.out.printf("Changed the key of %s to %s!%n", piece, key);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : list.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
