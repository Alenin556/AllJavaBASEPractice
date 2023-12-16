package OOP.start.lesson4ConditionalOperators;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        //1 - понедельник .... 5 - пятница
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Неправильный ввод");
        }

        // В JDK 17 операции можно прописывать через оператор -> который убирает инструкции break
//        switch (scanner.nextInt()) {
//            case 1 -> System.out.println("Понедельник");
//            case 1 -> System.out.println("Вторник");
//            case 1 -> System.out.println("Среда");
//            case 1 -> System.out.println("Четверг");
//            case 1 -> System.out.println("Пятница");
//            default -> System.out.println("Неправильный ввод");
//        }

    }
}
