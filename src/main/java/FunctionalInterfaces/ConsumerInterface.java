package FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerInterface {
    public static void main(String[] args) {

        // Consumer (с англ. — “потребитель”) — функциональный интерфейс,
        // который принимает в качестве входного аргумента объект типа T,
        // совершает некоторые действия, но при этом ничего не возвращает.
        // схож с методом void который может принять параметр обработать данные, при этом не вернуть ничего как результат выполнения операции

        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(printConsumer);

        Consumer<Integer> printer = x-> System.out.printf(x + " долларов");
        printer.accept(600); // 600 долларов
    }
}
