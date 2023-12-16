package OOP.lesson7OOP.practice;

public class Book {
    //Создать класс книга с атрибутами: имя книги, имя автора, количество страниц, документальный(да/нет)


    String bookName;
    String author;
    int pageCount;
    boolean documentary;


    public Book(String bookName, String author, int pageCount, boolean documentary) {
        this.bookName = bookName;
        this.author = author;
        this.pageCount = pageCount;
        this.documentary = documentary;
    }

    //Методы класса книга:
    //1. Вывод общего количества строк в книге - без аргументов:
    //Результат: Выводит на экран количество страниц * 40
    //2. Вывод общего количества строк в книге (количество строк в странице),
    //Результат: Выводит на экран количество страниц * количество строк в странице
    //3. Выводи информации о книге без аргументов
    //Результат: [имя книги] от [имя автора] - [документальная/недокументальная]

    public void getStringCount(){
        System.out.println(pageCount * 40);
    }

    public int getStringCount(int stringCount){
        return  pageCount * stringCount;
    }

    public String documentary(){
        String doc = "документальная";
        String doc1 = "недокументальная";
        if(this.documentary){
            return doc;
        } return doc1;
    }

    public void getBookInfo(){
      //  String phrase = String.format("%s от %s - %f",bookName,author, documentary);
        System.out.println(bookName + " от " + author + " - " + documentary());
       // System.out.println(phrase);
    }
}
