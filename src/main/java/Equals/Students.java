package Equals;

import Constructor.Student;

public class Students {

    public static void main(String[] args) {
        Constructor.Student studentA = new Constructor.Student("Andrew","AQA", "JAVA");
        Constructor.Student studentB = new Constructor.Student("Andrew","AQA", "JAVA");
        Constructor.Student newStudent = new Student("Alice", "AQA", "C++");
        System.out.println(studentA.getName());
        System.out.println(newStudent.getSpecialty());

        String id1 = "1";
        String id2 = "1";
        System.out.println(id1.equals(id2));

        System.out.println(studentA.equals(studentB));
    }
}
