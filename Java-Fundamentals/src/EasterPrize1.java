import java.util.Scanner;

public class EasterPrize1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int countPrize = 0;

        for (int i = n; i <=m ; i++) {
            int number = i;
            boolean prime = number>=2;
            for (int j = 2; j <=Math.sqrt(number) ; j++) {
                if (number % j ==0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                countPrize++;
                System.out.print(number + " ");
            }

           }
        System.out.println();
        System.out.printf("The total number of prime numbers between %d to %d is %d", n, m, countPrize);

        }

    }

