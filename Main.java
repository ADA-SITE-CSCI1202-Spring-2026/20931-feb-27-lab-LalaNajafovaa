
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ada", "Lovelace", "F");
        Person p2 = new Person("Ada", "Lovelace", "F");
        Person p3 = new Person("Alan", "Turing", "M");

        System.out.println(p1);
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p1.equals(p3) = " + p1.equals(p3));
        System.out.println();

        Teacher t1 = new Teacher("Grace", "Hopper", "F", "CS", List.of("CSCI1202", "CSCI2201"));
        Teacher t2 = new Teacher("Grace", "Hopper", "F", "CS", List.of("CSCI1202", "CSCI2201"));
        Teacher t3 = new Teacher("Grace", "Hopper", "F", "Math", List.of("MATH101"));

        System.out.println(t1);
        System.out.println("t1.equals(t2) = " + t1.equals(t2));
        System.out.println("t1.equals(t3) = " + t1.equals(t3));
        System.out.println();

        Student s1 = new Student("Linus", "Torvalds", "M", "S123");
        Student s2 = new Student("Linus", "Torvalds", "M", "S123");
        Student s3 = new Student("Linus", "Torvalds", "M", "S999");

        System.out.println(s1);
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(s3) = " + s1.equals(s3));
        System.out.println();

        PhdStudent ph1 = new PhdStudent("Katherine", "Johnson", "F", "P001", "Aerospace", List.of("Research Methods", "Advanced Calculus"));
        PhdStudent ph2 = new PhdStudent("Katherine", "Johnson", "F", "P001", "Aerospace", List.of("Research Methods", "Advanced Calculus"));
        PhdStudent ph3 = new PhdStudent("Katherine", "Johnson", "F", "P001", "Physics", List.of("Quantum"));

        System.out.println(ph1);
        System.out.println("ph1.equals(ph2) = " + ph1.equals(ph2));
        System.out.println("ph1.equals(ph3) = " + ph1.equals(ph3));
        System.out.println();

        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = new Rectangle(10, 5);

        System.out.println(r1);
        System.out.println("r1.equals(r2) = " + r1.equals(r2));
        System.out.println("r1.equals(r3) = " + r1.equals(r3));
        System.out.println();

        Square sq1 = new Square(7);
        Square sq2 = new Square(7);
        Square sq3 = new Square(8);

        System.out.println(sq1);
        System.out.println("sq1.equals(sq2) = " + sq1.equals(sq2));
        System.out.println("sq1.equals(sq3) = " + sq1.equals(sq3));
        System.out.println("sq1.equals(new Rectangle(7, 7)) = " + sq1.equals(new Rectangle(7, 7)));
    }
}
