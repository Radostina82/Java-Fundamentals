package MidExamExercise.ProgrammingFundamentalsMidExam_1;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allPeople = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isNoMore = false;
        int count = 0;

        for (int i = 0; i <= lift.length - 1; i++) {
            if (lift[i] == 0) {
                if (allPeople >= 4) {
                    lift[i] = 4;
                    allPeople -= 4;
                } else {
                    lift[i] = allPeople;
                    allPeople -= allPeople;
                }
            } else if (lift[i] == 1) {
                if (allPeople >= 3) {
                    lift[i] += 3;
                    allPeople -= 3;
                } else {
                    lift[i] = allPeople;
                    allPeople -= allPeople;
                }
            } else if (lift[i] == 2) {
                if (allPeople >= 2) {
                    lift[i] += 2;
                    allPeople -= 2;
                } else {
                    lift[i] = allPeople;
                    allPeople -= allPeople;
                }
            } else if (lift[i] == 3) {
                if (allPeople >=1) {
                    lift[i] += 1;
                    allPeople -= 1;
                } else {
                    lift[i] = allPeople;
                    allPeople -= allPeople;
                }
            }
            if (allPeople <= 0) {
                for (int i1 : lift) {
                    if (i1 != 4) {
                        count = 0;
                    } else {
                        count++;
                    }
                }
                break;
            }
            for (int i1 : lift) {
                if (i1 != 4) {
                    count = 0;
                    break;
                } else {
                    count++;
                }
            }
            if (count == lift.length) {
                break;
            }
        }

        if (count == lift.length && allPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", allPeople);
            for (int i1 : lift) {
                System.out.print(i1 + " ");
            }
        } else if (count != lift.length && allPeople == 0) {
            System.out.println("The lift has empty spots!");
            for (int i : lift) {
                System.out.print(i + " ");

            }
        } else if (count == lift.length && allPeople == 0) {
            for (int i : lift) {
                System.out.print(i + " ");
            }
        }
    }
}
