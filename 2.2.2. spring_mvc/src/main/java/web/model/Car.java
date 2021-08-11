package web.model;


public class Car {
    private String model;
    private int year;
    private int power;

    public Car() {
    }

    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", power=" + power +
                '}';
    }
}
