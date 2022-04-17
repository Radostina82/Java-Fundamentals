package OBJECTSANDCLASSESExercise.VehicleCatalogue_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int countCar = 0;
        int countTruck = 0;
        int sumHorsepowerCar = 0;
        int sumHorsepowerTruck = 0;
        List<VehicleCatalogue> catalogues = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split("\\s+")[0];
            String model = input.split("\\s+")[1];
            String color = input.split("\\s+")[2];
            int horsepower = Integer.parseInt(input.split("\\s+")[3]);
            if (type.equals("car")) {
                countCar++;
                sumHorsepowerCar += horsepower;
            } else if (type.equals("truck")) {
                countTruck++;
                sumHorsepowerTruck += horsepower;
            }
            VehicleCatalogue catalogue = new VehicleCatalogue(type, model, color, horsepower);
            catalogues.add(catalogue);

            input = scanner.nextLine();
        }
        String models = scanner.nextLine();

        while (!models.equals("Close the Catalogue")) {

            String finalModels = models;
            catalogues.stream().filter(v -> v.getModel().equals(finalModels)).forEach(System.out::println);

            models = scanner.nextLine();
        }
        if (countCar != 0 && countTruck != 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", sumHorsepowerCar * 1.0 / countCar);
            System.out.printf("Trucks have average horsepower of: %.2f.", sumHorsepowerTruck * 1.0 / countTruck);
        }else if (countCar!=0 && countTruck == 0){
            double count = 0.00;
            System.out.printf("Cars have average horsepower of: %.2f.%n", sumHorsepowerCar * 1.0 / countCar);
            System.out.printf("Trucks have average horsepower of: %.2f.", count);
        }else if (countCar==0 && countTruck!=0){
            double count = 0.00;
            System.out.printf("Cars have average horsepower of: %.2f.%n", count);
            System.out.printf("Trucks have average horsepower of: %.2f.", sumHorsepowerTruck * 1.0 / countTruck);
        }
    }
}
