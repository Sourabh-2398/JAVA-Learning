package Reflection;

public class Cat {

    private  final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public  void meow(){
        System.out.println("Meow");
    }

    private static void heyThisIsPrivate(){
        System.out.println("How you called this method?");
    }

    public static void thisIsAPublicStaticMethod(){
        System.out.println("I'm public and static !");
    }

    private static void thisIsAPrivateStaticMethod(){
        System.out.println("Hey, I'm private and static !");
    }
}
