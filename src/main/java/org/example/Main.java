package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(2024, 800));
        carList.add(new Car(2018, 300));
        carList.add(new Car(2025, 240));

        System.out.println("before sorting : " + carList);
        carList.sort(Comparator.comparingInt(Car::getYearOfManufacture));
        System.out.println("after sorting : " + carList);

        Comparator<Car> engineThenYear = Comparator
                .comparingInt(Car::getEngineCapacity)
                .thenComparingInt(Car::getYearOfManufacture);

        TreeSet<Car> sortedByEngine = new TreeSet<>(engineThenYear);
        sortedByEngine.addAll(carList);

        System.out.println("\nTreeSet за об’ємом двигуна:");
        for (Car car : sortedByEngine) {
            System.out.println(car);
        }

    }
}
