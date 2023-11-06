package FunctionalIntefaces;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(printConsumer);

        Consumer<Integer> printer = x-> System.out.printf(x + " долларов");
        printer.accept(600); // 600 долларов
    }
}
