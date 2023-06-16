import java.util.TreeMap;

//1)создать treemap из студентов ключ дабл - значение студент, перевернуть его
//2)сделать отрезки по средней оценке
//3)поменять ключи и значения местами
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        Student s3 = new Student(3, "C");
        Student s4 = new Student(4, "D");

//        TreeMap<Student, Double> tm = new TreeMap<>();
//        tm.put(s3, 5.6);
//        tm.put(s4, 5.7);
//        tm.put(s1, 9.7);
//        tm.put(s2, 2.9);
//        System.out.println(tm);
//        System.out.println(tm.headMap(s3));
//        System.out.println(tm.tailMap(s3));


//        TreeMap<Double,Student> tm = new TreeMap<>();
//        tm.put(5.6, s3);
//        tm.put(5.7, s4);
//        tm.put(9.7, s1);
//        tm.put(2.9, s2);
//        System.out.println(tm);

    }
}

class Student implements Comparable{
    private int id;
    private String fio;

    public Student(int id, String fio) {
        this.id = id;
        this.fio = fio;
    }

    @Override
    public int compareTo(Object o) {
        Student s =  (Student) o;
        return this.id - s.id;
    }
}