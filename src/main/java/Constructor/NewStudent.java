package Constructor;

public class NewStudent {

    public static void main(String[] args) {
        Student student = new Student("Andrew","AQA", "JAVA");
        Student newStudent = new Student("Alice", "Manual", "C++");
        System.out.println(student.getName());
        System.out.println(newStudent.getSpecialty());
    }
}
