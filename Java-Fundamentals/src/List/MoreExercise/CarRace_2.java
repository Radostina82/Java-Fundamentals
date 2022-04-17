package List.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> times = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        double timeLeftCar = 0;//лявата кола
        //дясната кола
        double timeRightCar = 0;

        //цикъл за времето на лявата кола
        for (int i = 0; i < (times.size() - 1) / 2; i++) {
            int element = times.get(i);
            timeLeftCar += element;

            if (element == 0) {
                timeLeftCar *= 0.8;
            }
        }

        //цикъл за времето на дясната кола
        for (int i = times.size() - 1; i > (times.size() - 1) / 2; i--) {
            int element = times.get(i);
            timeRightCar += element;

            if (element == 0) {
                timeRightCar *= 0.8;
            }
        }

        if (timeLeftCar<timeRightCar){
            System.out.printf("The winner is left with total time: %.1f", timeLeftCar);
        }else{
            System.out.printf("The winner is right with total time: %.1f", timeRightCar);
        }
    }
}
