package DataTypesAndVariables.MoreExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double num1 = Double.parseDouble(scanner.next());
       double num2 = Double.parseDouble(scanner.next());
       double eps = 0.000001;

       double subtract = Math.abs(num1 - num2);
       if (subtract < eps){
           System.out.println("True");
       }else{
           System.out.println("False");
       }
    }
}
