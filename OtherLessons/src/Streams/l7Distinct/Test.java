package Streams.l7Distinct;

import java.util.stream.Stream;

public class Test {
    //сравнение происходит по методу equals
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,1,1,2,2,2,3,3,3,4,4,4);
        integerStream.distinct().forEach(System.out::print);
    }

}
