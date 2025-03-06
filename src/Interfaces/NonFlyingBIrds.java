package Interfaces;

public interface NonFlyingBIrds extends Bird , LivingThings{

    @Override
    default void fly(){
        System.out.println("Non Flying Birds can't fly");
    }
}
