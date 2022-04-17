package Methods.MoreExercise;

import java.util.Scanner;

public class CenterPoint_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        closestPoint(x1, y1, x2, y2);
    }

    private static void closestPoint(int x1, int y1, int x2, int y2) {
        int firstPoint = Math.abs(x1) + Math.abs(y1);
        int secondPoint = Math.abs(x2) + Math.abs(y2);
        String result = "";
        if (firstPoint < secondPoint) {
            result = x1 + ", " + y1;
            System.out.println("(" + result + ")");
        } else {
            result = x2 + ", " + y2;
            System.out.println("(" + result + ")");
        }
    }
}
