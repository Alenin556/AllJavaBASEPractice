package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Runner {

    public static void main(String[] args) {
        try {
            System.out.println("Делим число на ноль");
            System.out.println(366 / 0);//в этой строчке кода будет выброшено исключение

            System.out.println("Этот");
            System.out.println("код");
            System.out.println("не");
            System.out.println("будет");
            System.out.println("выполнен!");

        } catch (ArithmeticException e) {

            System.out.println("Программа перепрыгнула в блок catch!");
            System.out.println("Ошибка! Нельзя делить на ноль!");
        }

        System.out.println(" ");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));

            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (IOException e) {
            System.out.println("Ошибка! Файл не найден!");
            e.printStackTrace();
        } finally {
            System.out.println("А вот и блок finally!");
        }
    }
}

