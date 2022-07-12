package session5;

public class Car {
    private String make;
    private String model;
    private int yearOfMake;
    private long miles;


    public Car() {
    }

    public Car(String make, String model, int yearOfMake, long miles) {
        this.make = make;
        this.model = model;
        this.yearOfMake = yearOfMake;
        this.miles = miles;
    }
    public String getName(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfMake=" + yearOfMake +
                ", miles=" + miles +
                '}';
    }
}
