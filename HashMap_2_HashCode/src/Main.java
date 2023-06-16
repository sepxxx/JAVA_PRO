//1
//создать несколько студентов, поместить в hashmap Key-студент, value - средняя оценка-double
//hashcode не переопределять, equals переопределить
//создать еще одного студента, попробовать по нему найти среднуюю оценку в Hashmap

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("A", 5);
        Student s2 = new Student("B", 5);
        Student s3 = new Student("C", 5);
        Student s4 = new Student("B", 5);

        HashMap<Student, Double> hm = new HashMap<>();
        hm.put(s1, 7.0);
        hm.put(s2, 8.0);
        hm.put(null, 9.2);
        System.out.println(hm);
        System.out.println(hm.get(s4));
        System.out.println(hm.containsKey(s4));
    }
}
class Student {
    private int course;
    private String fio;

    Student(String fio, int course) {
        this.fio = fio;
        this.course = course;
    }

    @Override
    public boolean equals(Object obj) {
        Student st = (Student) obj;
        return course==st.course && fio.equals(st.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, fio);
    }
}