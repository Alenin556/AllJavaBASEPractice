package Stringg;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Andrey";
        int age = 26;
        //String phrase = "Меня зовут " + name + " мне " + age + " лет";

        String phrase = String.format("Меня зовут %s. Мне %d лет", name, age);

        System.out.println(phrase);
    }
}
