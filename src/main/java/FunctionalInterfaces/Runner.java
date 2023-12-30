package FunctionalInterfaces;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {

        //Predicate — функциональный интерфейс для проверки соблюдения некоторого условия.
        // Если условие соблюдается, возвращает true, иначе — false.
        // метод test() передает значение в лямбду выражение и возвращает true или false как результат

        Set<String> names = new HashSet<>();
        names.add("Andrew");
        names.add("Alex");
        names.add("Nick");
        names.add("Sergio");
        Predicate<String> name = x -> names.contains(x);
        System.out.println(name.test("Sergio"));
        System.out.println(name.test("Ann"));

        System.out.println("____________________________\n");

        // Consumer (с англ. — “потребитель”) — функциональный интерфейс,
        // который принимает в качестве входного аргумента объект типа T,
        // совершает некоторые действия, но при этом ничего не возвращает.
        // схож с методом void который может принять параметр обработать данные, при этом не вернуть ничего как результат выполнения операции

        Consumer <Integer> consumer = x -> System.out.println(x) ;
        consumer.accept(5);

        System.out.println("____________________________\n");

        //Function — этот функциональный интерфейс принимает аргумент определенного типа данных Т и приводит его к объекту другого типа R,
        // который и возвращается как результат.
        Function<Long, String> function = x -> x.toString();
        String newString = function.apply(79219304285L);
        System.out.println(newString.substring(1));

        System.out.println("____________________________\n");

        //Supplier (с англ. — поставщик) — функциональный интерфейс, который не принимает никаких аргументов (параметров на вход),
        // но возвращает объект определенного типа T
        // имеет один метод get.
        Supplier<String> supplier = () -> new String("Hello");
        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> (1);
        System.out.println(supplier1.get());


    }
}
