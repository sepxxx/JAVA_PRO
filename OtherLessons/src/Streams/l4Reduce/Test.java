package Streams.l4Reduce;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);

        int result = integerArrayList.stream().reduce((a,e)->a*e).get();
        System.out.println(result);
    }
}
