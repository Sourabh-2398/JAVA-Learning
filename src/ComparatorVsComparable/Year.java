package ComparatorVsComparable;

import java.util.Comparator;

public class Year implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear() - o2.getYear();
    }
}

class Model implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}

class Brand implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}


