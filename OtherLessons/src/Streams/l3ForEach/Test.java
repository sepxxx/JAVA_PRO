package Streams.l3ForEach;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] array = {1,3,5,7};
//        Arrays.stream(array).forEach(e->System.out.println(e));
//        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(e->{e*=2;
            System.out.println(e);});
    }

}
