import java.util.Scanner;

public class EasterEggs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

       while (n>0){
           for (int i = 1; i <=n ; i++) {
               System.out.print(i);
               if (i==n){
                   for (int j = n-1; j >=1 ; j--) {
                       System.out.print(j);
                   }
               }
           }
           System.out.println();
           n--;
       }

    }
}
