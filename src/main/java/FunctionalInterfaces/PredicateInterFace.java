package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterFace {

    public static void main(String[] args) {

        //Predicate — функциональный интерфейс для проверки соблюдения некоторого условия.
        // Если условие соблюдается, возвращает true, иначе — false.
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(10));
        // метод test() передает значение в лямбду выражение и возвращает true или false как результат
    }
}
