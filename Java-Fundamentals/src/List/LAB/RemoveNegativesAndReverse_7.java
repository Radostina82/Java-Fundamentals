package List.LAB;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <= number.size()-1 ; i++) {
            int num = number.get(i);
            if (num < 0){
                number.remove((Object)num);
                i = i-1;
            }
        }
        if (number.size() > 0){
            Collections.reverse(number);
            for (int num: number) {
                System.out.print(num + " ");
            }
        }else{
            System.out.println("empty");
        }
    }
}
