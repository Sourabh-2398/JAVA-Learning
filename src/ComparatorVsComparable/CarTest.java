package ComparatorVsComparable;

import java.util.Arrays;
import java.util.HashSet;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("Mahindra","SUV", 2019);
        Car c2 = new Car("Mahindra","SUV", 2019);
        Car c3 = new Car("Mahindra","SUV", 2017);
        Car c4 = new Car("Tata", "Sedan", 2018);
        Car c5 = new Car("Tata", "HAtchback", 2019);
        Car[] cars = {c1,c2,c3,c4,c5};
        System.out.println("Intital Car list");
        printCar(cars);
        System.out.println("Normal year based Sorting Car list");
        Arrays.sort(cars, new Year());
        printCar(cars);
        System.out.println("Normal Model based Sorting Car list");
        Arrays.sort(cars, new Model());
        printCar(cars);
        System.out.println("Normal Brand based Sorting Car list");
        Arrays.sort(cars, new Brand());
        printCar(cars);
        System.out.println("Reverse  Year based anonymous Sorting Car list");
        Arrays.sort(cars, new Year(){
            @Override
            public int compare(Car c1, Car c2){

                return c2.getYear()-c1.getYear();
            }
        });
        printCar(cars);
        System.out.println("Reverse Model based Sorting Car list based on Lambda");
        Arrays.sort(cars, (Car A, Car B) -> B.getModel().compareTo(A.getModel()));
        printCar(cars);
        HashSet<Car> set = new HashSet<>(Arrays.stream(cars).toList());
        System.out.println(set.size());
    }

    public static void printCar(Car[] cars){
        for(Car car : cars){
            System.out.println(car.getYear() + " " + car.getBrand() + " " + car.getModel());
        }

    }
}
