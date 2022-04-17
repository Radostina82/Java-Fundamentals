package OBJECTSANDCLASSESMoreExercise.CarSalesman_3;

public class Car {
    private String model;
    private Engine engine;
    private String  weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
