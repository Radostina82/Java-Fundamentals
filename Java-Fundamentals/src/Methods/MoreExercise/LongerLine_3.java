package Methods.MoreExercise;

import java.util.Scanner;

public class LongerLine_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        checkAndPrintDistance(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public static double distance(double x, double y) {
        double dictance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return dictance;
    }

    public static void checkAndPrintDistance(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        double dictancePoint1 = distance(x1, y1);
        double dictancePoint2 = distance(x2, y2);
        double dictancePoint3 = distance(x3, y3);
        double dictancePoint4 = distance(x4, y4);
        double lengthPoint12 = Math.sqrt((Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2)));
        double lengthPoint34 = Math.sqrt((Math.pow((x3 - x4),2) + Math.pow((y3 - y4), 2)));

        if (lengthPoint12 >= lengthPoint34){
            if (dictancePoint1<=dictancePoint2){
                System.out.println("(" + (int)x1 + ", "  +(int) y1 + ")" + "(" +(int) x2 + ", " +(int) y2 + ")");
            }else {
                System.out.println("(" + (int)x2 + ", "  +(int) y2 + ")" +  "(" + (int)x1 + ", " + (int)y1 + ")");
            }
        }else if (lengthPoint12<lengthPoint34){
            if (dictancePoint3<= dictancePoint4){
                System.out.println("(" + (int)x3 + ", "  +(int) y3 + ")" + "(" + (int)x4 + ", " + (int)y4 + ")");
            }else {
                System.out.println("(" + (int)x4 + ", " + (int)y4 + ")" +  "(" +(int) x3 + ", " + (int)y3 + ")");
            }
        }
    }
}
