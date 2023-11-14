package Exceptions;

import java.io.IOException;

public class ArrayException {
    public static void main(String[] args) {
        String names[] = new String[5];
        names[0] = "Андрей";
        names[1] = "Андрей";
        names[2] = "Андрей";
        names[3] = "Андрей";
        names[4] = "Андрей";
        try {
            System.out.println(names[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! имени по данному индексу не найдено!");
        } finally {
            System.out.println("Завершение поиска.");
        }
    }
}
