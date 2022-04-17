package FinalExam03_04_2021;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countUnlike = 0;
        Map<String, List<String>> guests = new TreeMap<>();
        Map<String, Integer> unlike = new LinkedHashMap<>();
        while (!input.equals("Stop")) {
            //Like-Krisi-shrimps
            String[] token = input.split("-");
            String command = token[0];

            if (command.equals("Like")) {
                String guestName = token[1];
                String meal = token[2];
                if (!guests.containsKey(guestName)) {
                    guests.put(guestName, new ArrayList<>());
                    guests.get(guestName).add(meal);
                } else {
                    if (!guests.get(guestName).contains(meal)) {
                        guests.get(guestName).add(meal);
                    }
                }

            } else if (command.equals("Unlike")) {
                String guestName = token[1];
                String meal = token[2];

                if (!guests.containsKey(guestName)) {
                    System.out.println(guestName + " is not at the party.");
                } else {
                    if (!guests.get(guestName).contains(meal)) {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guestName, meal);
                    } else {
                       countUnlike++;
                        System.out.printf("%s doesn't like the %s.%n", guestName, meal);
                        List<String> value = guests.get(guestName);
                        int indexMeals = value.indexOf(meal);
                        guests.get(guestName).remove(indexMeals);

                       // unlike.put(guestName, countUnlike + 1);
                    }
                }
            }

            input = scanner.nextLine();
        }
        guests.entrySet().stream().sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size()).
                forEach(s -> {
                    System.out.print(s.getKey() + ": ");
                    List<String> value = s.getValue();
                    for (int i = 0; i <= value.size() - 1; i++) {
                          String currentElement = value.get(i);
                          if (i== value.size()-1){
                              System.out.print(currentElement);
                              break;
                          }
                        System.out.print(currentElement + ", ");
                    }
                    System.out.println();
                });

        /*if (unlike.size() == 0) {
            System.out.println("Unliked meals: 0");
        }else {
            for (Map.Entry<String, Integer> entry : unlike.entrySet()) {
                System.out.println(entry.getKey() + ":");
                System.out.println("Unliked meals: " + entry.getValue());
            }
        }*/
        System.out.println("Unliked meals: " + countUnlike);
    }
}
