package Implement;

public class FlyingBird {

    public static void main(String[] args) {
        Eagle eagleObject = new Eagle("Mike");
        eagleObject.canFly();
        System.out.println(eagleObject.toString());

        Consumer<Integer> logger = (Integer val)->{
          if(val>10){
              System.out.println("I'm logging");
          }
        };

        logger.accept(12);

        Supplier<String> isEvenNumber = ()-> "This is data I'm returning";
        System.out.println(isEvenNumber.get());

        Function<Integer,String> fun = (Integer value) -> {
            System.out.println(isEvenNumber.get() + " : " + value);
            return "I'm returning given value in String Format " + value.toString();
        };
        System.out.println(fun.apply(10));

        Predicate<Integer> isEven = (Integer value) ->value % 2 == 0;
        System.out.println("I have decided I'm Even " + isEven.test(10));


    }
}
