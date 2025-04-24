package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(2024);
        Car car2 = new Car(2018);
        Car car3 = new Car(2025);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println("before sorting : " + cars);
        Collections.sort(cars);
        System.out.println("after sorting : " + cars);
    }

}