package Constructor;

public class Info {

     String country = "Russia";

    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {
        Student studentA = new Student("Andrew","AQA", "JAVA");
        Student studentB = new Student("Andrew","AQA", "JAVA");
        Student newStudent = new Student("Alice", "AQA", "C++");
        System.out.println(studentA.getName());
        System.out.println(newStudent.getSpecialty());



    }
}
