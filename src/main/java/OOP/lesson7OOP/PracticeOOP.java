package OOP.lesson7OOP;

import OOP.lesson7OOP.practice.Book;

public class PracticeOOP {
    public static void main(String[] args) {
        //Создать класс книга с атрибутами: имя книги, имя автора, количество страниц, документальный(да/нет)
        //Методы класса книга:
        //1. Вывод общего количества строк в книге - без аргументов:
        //Результат: Выводит на экран количество страниц * 40
        //2. Вывод общего количества строк в книге (количество строк в странице),
        //Результат: Выводит на экран количество страниц * количество строк в странице
        //3. Выводи информации о книге без аргументов
        //Результат: [имя книги] от [имя автора] - [документальная/недокументальная]

        Book book = new Book("Королевство", "Автор", 564, false);
        book.getStringCount();
        System.out.println(book.getStringCount(123));
        book.getBookInfo();
    }
}
