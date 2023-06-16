package lamdaExpressions.Part2;

import lamdaExpressions.Student;

import java.util.*;


//Lambda выражения. Часть 2
//1)укоротить все выражения
//2)сделать сортировку с компаратором, преобразовать в лямбда-функции

//в лямбда-функциях мы можем использовать переменные уровня метода, но только если они final,
// либо далее не изменяются ни в теле лямбды, ни после нее

interface  StudentCheck {
    boolean check(Student s);
}

class StudentInfo {
    public void testStudents(List<Student> al, StudentCheck sc) {
        for(Student s:al) {
            if(sc.check(s))
                System.out.println(s);
        }
    }
}



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

        StudentInfo si = new StudentInfo();
//        si.testStudents(al, new StudentCheck() {
//            @Override
//            public boolean check(Student s) {
//                return s.getAge() > 18 && s.getGrade() > 5;
//            }
//        });
//        si.testStudents(al, s-> (s.getAge() > 18 && s.getGrade() > 5));
//        System.out.println("-----------------------------");
//        si.testStudents(al, s-> (s.getAge() > 18 && s.getGrade() > 5 && s.getId() >= 2));


//        Collections.sort(al, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        Collections.sort(al, (st1, st2)->(st1.getGrade() - st2.getGrade()));

        System.out.println(al);

    }
}
