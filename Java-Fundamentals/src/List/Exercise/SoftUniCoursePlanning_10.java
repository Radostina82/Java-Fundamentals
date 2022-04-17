package List.Exercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//график на уроците
        List<String> scheduleLessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String output = scanner.nextLine();

        while (!output.equals("course start")) {
            String[] token = output.split("\\:");

            if (token[0].equals("Add")) {
                boolean isLessonsExists = isLessonsExists(scheduleLessons, token);
                if (!isLessonsExists) {
                    scheduleLessons.add(token[1]);
                }

            } else if (token[0].equals("Insert")) {
                int index = Integer.parseInt(token[2]);
                boolean isLessonsExists = isLessonsExists(scheduleLessons, token);
                if (!isLessonsExists) {
                    scheduleLessons.add(index, token[1]);
                }

            } else if (token[0].equals("Remove")) {

                boolean isLessonsExists = isLessonsExists(scheduleLessons, token);
                if (isLessonsExists) {
                    scheduleLessons.remove((Object) token[1]);
                }
                if (scheduleLessons.contains(token[1] + "-Exercise")) {
                    scheduleLessons.remove(token[1] + "-Exercise");
                }
            } else if (token[0].equals("Swap")) {
                swapLessons(scheduleLessons, token);

            } else if (token[0].equals("Exercise")) {
                addExercise(scheduleLessons, token);
            }

            output = scanner.nextLine();
        }
        int counter = 0;
        for (String scheduleLesson : scheduleLessons) {
            counter++;
            System.out.printf("%d.%s%n", counter, scheduleLesson);
        }
    }

    private static boolean isLessonsExists(List<String> scheduleLessons, String[] token) {
        return scheduleLessons.contains(token[1]);
    }

    private static List<String> swapLessons(List<String> scheduleLessons, String[] token) {

        if (scheduleLessons.contains(token[1]) && scheduleLessons.contains(token[2])) {
            int indexLesson1 = scheduleLessons.indexOf(token[1]);
            int indexLesson2 = scheduleLessons.indexOf(token[2]);
            scheduleLessons.set(indexLesson1, token[2]);
            scheduleLessons.set(indexLesson2, token[1]);

            if (scheduleLessons.contains(token[1] + "-Exercise")) {
                scheduleLessons.remove(token[1] + "-Exercise");
                scheduleLessons.add(indexLesson2 + 1, token[1] + "-Exercise");
            }
            if (scheduleLessons.contains(token[2] + "-Exercise")) {
                scheduleLessons.remove(token[2] + "-Exercise");
                scheduleLessons.add(indexLesson1 + 1, token[2] + "-Exercise");
            }
        }

        return scheduleLessons;
    }


    private static List<String> addExercise(List<String> scheduleLessons, String[] token) {

        boolean isLessonsExists = isLessonsExists(scheduleLessons, token);
        if (isLessonsExists && !scheduleLessons.contains(token[1] + "-" + token[0])) {
            int index = scheduleLessons.indexOf(token[1]);
            scheduleLessons.add(index + 1, token[1] + "-Exercise");

        } else if (!isLessonsExists && !scheduleLessons.contains(token[1] + "-" + token[0])) {
            scheduleLessons.add(token[1]);
            scheduleLessons.add(token[1] + "-Exercise");
        }else if (!isLessonsExists && scheduleLessons.contains(token[1] + "-" + token[0])){
            scheduleLessons.add(token[1]);
            scheduleLessons.remove(token[1] + "-Exercise");
            scheduleLessons.add(token[1] + "-Exercise");
        }

        return scheduleLessons;
    }

}
