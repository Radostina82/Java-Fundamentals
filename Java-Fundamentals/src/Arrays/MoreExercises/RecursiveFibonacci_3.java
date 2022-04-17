package Arrays.MoreExercises;

import java.util.Scanner;

public class RecursiveFibonacci_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long[] fibonachi = new long[n];
        if (n >= 1 && n <= 50) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == 1) {
                    fibonachi[i] = 1;
                }else {
                    fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
                }
            }
            System.out.println(fibonachi[n-1]);
        }else{
            System.out.println(n);
        }
    }
}
