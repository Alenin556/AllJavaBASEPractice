package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterFace {

    public static void main(String[] args) {

        // метод test() фильтрует по условию лямбды выражения true или false на выходе
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(10));
    }
}
