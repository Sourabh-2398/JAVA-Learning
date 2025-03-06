package Interfaces;

public class Animal implements Bird{

    @Override
    public void fly() {
       System.out.println("Animal can't fly");
    }

    @Override
    public void eat(){
        System.out.println("Animal is eating");

    }
}
