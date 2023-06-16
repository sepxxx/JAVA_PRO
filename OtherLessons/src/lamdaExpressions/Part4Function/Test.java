package lamdaExpressions.Part4Function;

import lamdaExpressions.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


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

        Function<Student,Double> f = student -> Double.valueOf(student.getAge());
        System.out.println(avgOfSmth(al, f));
    }
    public static double avgOfSmth(List<Student> al, Function<Student,Double> f) {
        Double res = 0.0;
        for (Student s: al) {
            res+=f.apply(s);
        }
        return res/al.size();
    }
}
