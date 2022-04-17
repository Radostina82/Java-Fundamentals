package List.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
//първоначално качество на всеки барабан
        List<Integer> qualityDrum = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newQualityDrum = new ArrayList<>(qualityDrum);
        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(input);

            for (int i = 0; i <= newQualityDrum.size() - 1; i++) {
                int quality = newQualityDrum.get(i);
                int qualityHit = quality - power;
                if (qualityHit <= 0) {
                    if (money - qualityDrum.get(i) * 3 >= 0) {
                        money -= qualityDrum.get(i) * 3;
                        qualityHit = qualityDrum.get(i);
                        newQualityDrum.set(i, qualityHit);
                        continue;
                    } else {
                        newQualityDrum.remove(i);
                        qualityDrum.remove(i);
                        i--;
                        continue;
                    }
                }

                newQualityDrum.set(i, qualityHit);
            }

            input = scanner.nextLine();
        }

        for (Integer integer : newQualityDrum) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", money);
    }
}
