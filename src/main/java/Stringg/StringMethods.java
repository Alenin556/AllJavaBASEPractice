package Stringg;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String text = "Welcome Drew!";

        String word = "world";
        // Заменяем в слове подстроку "l" на пустую строку, то есть удаляем её
        String newWord = word.replaceAll("l", ""); // "word"
        System.out.println(newWord);

        //Перевод в верхний регистр
        String upper = text.toUpperCase();
        System.out.println(upper);

        //Перевод в нижний регистр
        String lower = text.toLowerCase();
        System.out.println(lower);

        //Длина строки
        int lenght = text.length();
        System.out.println(lenght);

        //Есть ли в тексте другой текст?
        boolean contains = text.contains("Drew");
        System.out.println(contains);

        //Замена кусков текста(подстроки) на другой текст
        String replaceText = text.replaceAll("D", "And");
        System.out.println(replaceText);

        //Повторить текст n раз
        String textRepeated = text.repeat(3);
        System.out.println(textRepeated);

        //Разбить текст на массив String
        String names = "Yuri;Olga;Petr;Vasya";
        String[] arrayNames = names.split(";");
        System.out.println(Arrays.toString(arrayNames));

        //Объединение строк (Конкатенация)
        String word1 = "Привет";
        String word2 = "Андрей =)";
        System.out.println(word1 + " " + word2);

        //Начинается на подстроку
        boolean startWithHelp = text.startsWith("Wel");
        System.out.println(startWithHelp);

        //Заканчивается на подстроку
        boolean endWithHelp = text.endsWith("ew!");
        System.out.println(endWithHelp);

        //Сокращение строки
        String substringTextHelp = text.substring(8);
        String substringTextHelp1 = text.substring(8,11);
        String substringTextHelp2 = text.substring(0,7);
        System.out.println(substringTextHelp);
        System.out.println(substringTextHelp1);
        System.out.println(substringTextHelp2);


    }
}
