package OBJECTSANDCLASSESExercise.OrderByAge_7;

public class OrderByAge {
    private String name;
    private String personID;
    private int age;

    public OrderByAge(String name, String personID, int age) {
        this.name = name;
        this.personID = personID;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override

    public String toString(){

        return String.format("%s with ID: %s is %d years old.%n", name, personID, age);
    }
}
