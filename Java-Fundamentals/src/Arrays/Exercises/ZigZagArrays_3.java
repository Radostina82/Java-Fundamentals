package Arrays.Exercises;

import java.util.Scanner;

public class ZigZagArrays_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] array1 = new String[n];
        String[] array2 = new String[n];

        //четен път на въвеждаме -> първото число -> масив 2; второто -> масив 1
        //нечетен път на въвеждане -> първото -> масив 1; второто -> масив 2

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstElement = input[0];
            String secondElement = input[1];

            if ((i+1) % 2 == 0) {
                array2[i] = firstElement;
                array1[i] = secondElement;
            }else{
                array1[i] = firstElement;
                array2[i] = secondElement;
            }

        }
        System.out.println(String.join(" ", array1));
        System.out.print(String.join(" ", array2));
    }
}
