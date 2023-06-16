package Streams.l2Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("How are u?");
        stringList.add("im ok");
        stringList.add("and you?");

        List<String> stringList2 = stringList.stream().filter(s->s.length()>6).collect(Collectors.toList());
        System.out.println(stringList2);
    }
}