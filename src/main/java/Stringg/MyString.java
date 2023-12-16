package Stringg;

public class MyString {
    public static void main(String[] args) {
        char symbol = 'a';
        String text = "hey";
        String text2 = "hey";

        String text3 = new String("hey");
        String text4 = new String("hey");

        System.out.println(text == text2);
        System.out.println(text3 == text4);
        System.out.println(text3.equals(text4));

    }
}
