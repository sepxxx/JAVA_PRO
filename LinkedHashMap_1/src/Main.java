import java.util.LinkedHashMap;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        Student s3 = new Student(3, "C");
        Student s4 = new Student(4, "D");

        LinkedHashMap<Double,Student> lhm = new LinkedHashMap<>();
        lhm.put(5.6, s3);
        lhm.put(5.7, s4);
        lhm.put(9.7, s1);
        lhm.put(2.9, s2);
        System.out.println(lhm);
//        System.out.println(lhm.get(5.6));
        System.out.println(lhm.get(9.7));
        System.out.println(lhm);

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