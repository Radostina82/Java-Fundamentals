package FinalExamExercise.Exam09_08_2020;

import java.util.Scanner;

public class WorldTour_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String command = input.split(":")[0];

            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(input.split(":")[1]);
                String string = input.split(":")[2];

                if (index >= 0 && index < stops.length()) {
                   stops.insert(index, string);
                }
                System.out.println(stops);
            } else if (command.equals("Remove Stop")) {
                int firstIndex = Integer.parseInt(input.split(":")[1]);
                int secondIndex = Integer.parseInt(input.split(":")[2]);

                if (firstIndex>=0 && firstIndex< stops.length() && secondIndex>=0 && secondIndex< stops.length()) {
                   stops.delete(firstIndex, secondIndex+1);
                }
                System.out.println(stops);

            } else if (command.equals("Switch")) {
                String oldString = input.split(":")[1];
                String newString = input.split(":")[2];
                String newStop = stops.toString();
                newStop = newStop.replace(oldString, newString);
                stops = new StringBuilder(newStop);
                System.out.println(stops);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
