package Arrays.Exercises;

import java.util.Scanner;

public class Train_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] peoples = new int[num];
        int sum = 0;
        for (int index = 0; index <= peoples.length - 1; index++) {
            int people = Integer.parseInt(scanner.nextLine());
            peoples[index] = people;
        }
        for (int n : peoples) {
            System.out.print(n + " ");
            sum += n;
        }
        System.out.println();
        System.out.print(sum);
    }
}
