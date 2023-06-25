package Streams.l14MinMax;

import lamdaExpressions.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        Student s1 = new Student(1, 22, 9);
        Student s2 = new Student(2, 21, 7);
        Student s3 = new Student(3, 18, 10);
        Student s4 = new Student(4, 19, 5);
        Student s5 = new Student(5, 23, 7);
        Student s6 = new Student(6, 23, 9);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.add(s6);

//        Student theYoungest = al.stream().sorted((x,y)->x.getAge()-y.getAge()).findFirst().get();
        Student theYoungest = al.stream().min((x,y)->x.getAge()-y.getAge()).get();
        Student theOldest = al.stream().max((x,y)->x.getAge()-y.getAge()).get();
        System.out.println(theYoungest);
        System.out.println(theOldest);
    }
}
