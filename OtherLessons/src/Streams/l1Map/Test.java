package Streams.l1Map;
//Введение в Streams. Метод map
//1)Пройти по листу String и создать лист с длинами с помощью for
//2)сделать то же с лямбда-функ и Streams-map

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

//        List<Integer> integerList = new ArrayList<>();
//        for(String s: stringList) {
//            integerList.add(s.length());
//        }
//        System.out.println(integerList);

        List<Integer> integerList = stringList.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
