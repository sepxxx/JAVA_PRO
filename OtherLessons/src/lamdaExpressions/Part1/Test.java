package lamdaExpressions.Part1;
import lamdaExpressions.Student;
import java.util.ArrayList;
import java.util.List;


//Lambda выражения. Часть 1
//1)Создать класс StudentInfo с методом testStudents(ArrayList<Student> al , StudentCheck sc)
//2)Создать интерфейс StudentCheck с методом check(STUDENT S)
//3)написать проверки с анонимными классами и с лямбда-выражениями

interface  StudentCheck {
    boolean check(lamdaExpressions.Student s);
}

class StudentInfo {
    public void testStudents(List<Student> al, StudentCheck sc) {
        for(lamdaExpressions.Student s:al) {
            if(sc.check(s))
                System.out.println(s);
        }
    }
}



public class Test {
    public static void main(String[] args) {
        List<lamdaExpressions.Student> al = new ArrayList<>();
        lamdaExpressions.Student s1 = new lamdaExpressions.Student(1, 22, 9);
        lamdaExpressions.Student s2 = new lamdaExpressions.Student(2, 21, 8);
        lamdaExpressions.Student s3 = new lamdaExpressions.Student(3, 18, 10);
        lamdaExpressions.Student s4 = new lamdaExpressions.Student(4, 19, 5);
        lamdaExpressions.Student s5 = new lamdaExpressions.Student(5, 23, 7);
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
        si.testStudents(al, (Student s)-> {return  s.getAge() > 18 && s.getGrade() > 5;});
     }
}
