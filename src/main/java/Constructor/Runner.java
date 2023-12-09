package Constructor;

public class Runner {
    public static void main(String[] args) {

        Student student = new Student("Andrew","AQA","Java");
        String country = student.country;
        System.out.println(country);
    }
}
