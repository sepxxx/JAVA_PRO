package Streams.l8Count;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,1,1,2,2,2,3,3,3,4,4,4);
        System.out.println(integerStream.distinct().count());
    }
}
