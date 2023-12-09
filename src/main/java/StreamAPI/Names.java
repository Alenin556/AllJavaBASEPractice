package StreamAPI;

import java.util.List;

public class Names {
    public static void main(String[] args) {

        final List<String> list = List.of("Andrew", "Julia", "Max", "John");

        list.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    //перебирает все имено до условия когда имя по длине меньше или ровно 4
                    return s.length() <= 4;
                })
                .map(s1 -> {
                    // происходит обработка подходящего по условию элемента коллекции
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                })
                .forEach(x -> {
                    //возвращает обработанный элемент в map
                    System.out.println("forEach: " + x);
                });
    }
}
