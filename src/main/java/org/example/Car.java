package org.example;

import static java.lang.Long.compare;

public class Car implements Comparable<Car> {
    private int yearOfManufacture;
    private int engineCapacity;

    public Car(int yearOfManufacture) {
    }

    public Car(int yearOfManufacture, int engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{year=" + yearOfManufacture + ", engine=" + engineCapacity + "cc}";
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.yearOfManufacture, o.yearOfManufacture);

    }
}
