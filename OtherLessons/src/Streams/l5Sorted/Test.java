package Streams.l5Sorted;

import lamdaExpressions.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        Student s1 = new Student(1, 22, 9);
        Student s2 = new Student(2, 21, 8);
        Student s3 = new Student(3, 18, 10);
        Student s4 = new Student(4, 19, 5);
        Student s5 = new Student(5, 23, 7);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

        al = al.stream().sorted((a,b)->(a.getAge() -  b.getAge())).collect(Collectors.toList());
        System.out.println(al);
    }
}
