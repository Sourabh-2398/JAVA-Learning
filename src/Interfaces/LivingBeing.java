package Interfaces;

abstract class LivingBeing extends Animal implements LivingThings{
    public abstract void eat();
    public abstract void sleep();

    int lifeSpan;
    int eyes;

    public LivingBeing(String name){

    }
}
