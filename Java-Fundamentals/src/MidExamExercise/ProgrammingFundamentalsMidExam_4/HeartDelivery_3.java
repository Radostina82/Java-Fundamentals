package MidExamExercise.ProgrammingFundamentalsMidExam_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int allJump = 0;
        int lastPosition = -1;
        int countValentine = 0;


        while (!input.equals("Love!")) {
            String[] command = input.split("\\s+");
            int jump = Integer.parseInt(command[1]);

            allJump += jump;

            if (allJump > list.size() - 1) {
                allJump = 0;
            }
            for (int i = allJump; i <= allJump; i++) {
                int element = list.get(allJump);
                if (element == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", i);

                } else {
                    list.set(i, element - 2);
                    if (element - 2 == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", i);
                        countValentine++;
                    }
                }
                lastPosition = i;
            }


            input = scanner.nextLine();
        }

        boolean isSuccessful = true;
        for (Integer integer : list) {
            if (integer != 0) {
                isSuccessful = false;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", lastPosition);

        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", list.size() - countValentine);
        }
    }
}
