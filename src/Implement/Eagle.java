package Implement;

public class Eagle implements Bird {

    String name;
    public Eagle(String name) {
     this.name = name;
    }

    @Override
    public void canFly() {
        System.out.println(name + " can fly ");
    }
}
