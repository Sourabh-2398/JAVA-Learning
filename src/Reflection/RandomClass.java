package Reflection;

public class RandomClass {
    int age = 0;
    String name = "Random";
    public RandomClass(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void print() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
