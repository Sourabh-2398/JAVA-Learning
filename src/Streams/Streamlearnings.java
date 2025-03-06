package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamlearnings {
    public static void main(String[] args) {
        //way to create Stream
        //From Collection
        List<Integer> salaryList = Arrays.asList(3000,4000,5000,7000);
        Stream<Integer> salaryStream = salaryList.stream();

        //From Array
        Integer[] salaries ={4000,5000,7000,5500,4500,8100};
        Stream<Integer> salaryStream2 = Arrays.stream(salaries);
        Optional<Integer> maxSalary = salaryStream2.filter(salary -> salary >= 6000).max((Integer val1, Integer val2) -> val2 - val1);
        System.out.println(maxSalary.get());

        //StaticMethod
        Stream<Integer> salaryStream3 = Stream.of(salaries);

        //using builder pattern
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(100).add(200).add(300).add(400).add(500);
        Stream<Integer> streamFromStream = streamBuilder.build();

        //From Stream iterate
        Stream<Integer> streamFromIterate =Stream.iterate(1000,(Integer n) -> n + 5000).limit(5);

//         Stream.of("HOW","ARE","YOU","GUYS","DOING").filter(
//                (String Name) -> Name.length()<=3).forEach(System.out::println);
        String[] ans = Stream.of("HOW","ARE","YOU","GUYS","DOING").filter(
                (String Name) -> Name.length()<=3).map(String::toLowerCase).toArray(String[]::new);
        System.out.println(Arrays.toString(ans));

        List<Integer> numbers = Arrays.asList(2,1,4,7,10,18);
        Optional<Integer> reduce = numbers.stream().reduce((val1, val2) -> val1*val2);
        System.out.println(reduce.get());

        boolean hasValueGreaterThanThree = numbers.stream().anyMatch(n -> n > 3);
        System.out.println(hasValueGreaterThanThree);

        boolean hasAllValueGreaterThanthree = numbers.stream().allMatch(n -> n > 3);
        System.out.println(hasAllValueGreaterThanthree);

        boolean hasNoneValueGreaterThanthree = numbers.stream().noneMatch(n -> n > 3);
        System.out.println(hasNoneValueGreaterThanthree);


    }
}
