package Interfaces;

public interface Bird {
    void fly();
    default void eat(){
        System.out.println("Bird is eating");
    }

    static void sleep() {

    }
}

