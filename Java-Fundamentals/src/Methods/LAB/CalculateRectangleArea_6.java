package Methods.LAB;

import java.util.Scanner;

public class CalculateRectangleArea_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine()); //ширина
        double length = Double.parseDouble(scanner.nextLine()); //дължина
        double area = getArea(width, length);
        System.out.printf("%.0f",area);
    }

    private static double getArea(double width, double length) {
        return width * length;
    }
}
