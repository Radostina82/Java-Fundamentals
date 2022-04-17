package OBJECTSANDCLASSESMoreExercise.RawData_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<Car> cars = new LinkedHashSet<>();
        Car car;
        Engine engine;
        Cargo cargo;
        Tire tire1;
        Tire tire2;
        Tire tire3;
        Tire tire4;

        for (int i = 1; i <= n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower  = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tire1Pressure = Double.parseDouble(input[5]);
            int tire1Age = Integer.parseInt(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            int tire2Age = Integer.parseInt(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            int tire3Age = Integer.parseInt(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            int tire4Age = Integer.parseInt(input[12]);

             engine = new Engine(engineSpeed, enginePower);
             cargo = new Cargo(cargoWeight, cargoType);
            tire1 = new Tire(tire1Pressure, tire1Age);
            tire2 = new Tire(tire2Pressure, tire2Age);
            tire3 = new Tire(tire3Pressure, tire3Age);
            tire4 = new Tire(tire4Pressure, tire4Age);

            car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);
            cars.add(car);
        }
        String command = scanner.nextLine();
        List<String> output = new ArrayList<>();

        if (command.equals("fragile")){
            cars.forEach(e -> {
                if (e.getCargo().getType().equals("fragile")) {
                    for (Tire tireSet : e.getTires()) {
                        if (tireSet.getPressure() < 1) {
                            output.add(e.getModel());
                            break;
                        }
                    }
                }
            });
        }else {
            cars.forEach(e -> {
                if (e.getCargo().getType().equals("flamable") && e.getEngine().getPower() > 250) {
                    output.add(e.getModel());
                }
            });
        }
        output.forEach(System.out::println);
    }
}
