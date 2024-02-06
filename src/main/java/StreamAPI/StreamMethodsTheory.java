package StreamAPI;


import org.junit.jupiter.api.Assertions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsTheory {
    public static void main(String[] args) {

        List<String> nameList = List.of("Андрей Аленин", "Максим Дроздов", "Николай Скворцов", "Андрей Кравцов");
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("map()");

        //map() Преобразование

        // n приравнивается к одному элементу коллекции для перебора (как при for each) и после -> мы указываем как фильтруется наша коллекция
        Stream<String> namesAndCity = nameList.stream().map(n -> n + " из Питера");
        Stream<Integer> numbers10 = numbersList.stream().map(n -> n * 10);

        namesAndCity.forEach(System.out::println);
        numbers10.forEach(System.out::println);

        System.out.println("_________________________\n");
        System.out.println("filter()");

        //filter() Фильтрация

        // Отсеивание части объектов можно сделать с помощью метода filter().
        // Оставляет только те имена, в которых есть буква "..."

        Stream<String> filterNamesWithA = nameList.stream().filter(n -> n.contains("д"));
        // оставляет только те числа, которые больше 5
        Stream<Integer> filterNumbers = numbersList.stream().filter(n -> n < 5);

        filterNamesWithA.forEach(System.out::println);
        filterNumbers.forEach(System.out::println);

        System.out.println("_________________________\n");
        System.out.println("collect()");

        // collect собрать элементы

        List<Integer> three = numbersList.stream().filter(n -> n > 3).collect(Collectors.toList());
        System.out.println(three);

        System.out.println("_________________________\n");
        System.out.println("count()");

        //count() Получение количества

        long countNames = nameList.stream().count();
        System.out.println(countNames);

        System.out.println("_________________________\n");
        System.out.println("distinct()");

        //dictinct() Удаление дублей

        List<Integer> numbersList1 = List.of(11, 22, 29, 14, 25, 14, 27, 11, 22);
        Stream<Integer> distinctNumbers = numbersList1.stream().distinct();
        distinctNumbers.forEach(System.out::println);

        System.out.println("_________________________\n");
        System.out.println("sorted()");

        //sorted() Сортировка

        //По умолчанию использует «натуральный порядок», т.е. сортировку по возрастанию.
        //sorted(Comparator.reverseOrder()) отсортирует набор в обратном порядке

        List<Integer> numbersList2 = List.of(11, 2, 9, 4, 15, 6, 7, 12, 1);
        Stream<Integer> sortedNumbers = numbersList2.stream().sorted();
        sortedNumbers.forEach(System.out::println);

        System.out.println("_________________________\n");

        //  Поток здесь создается из существующего массива с помощью метода Arrays.stream().
        //  Все элементы массива преобразуются в элементы потока.
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> numStream = Arrays.stream(arr).sorted(Comparator.reverseOrder());

        Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(System.out::println);// тоже самое что и numStream.forEach(System.out::println);
        numStream.forEach(System.out::println);
        System.out.println("_________________________\n");


        System.out.println("allMatch(), anyMatch(), noneMatch()");

        boolean allMatch = numbersList.stream().allMatch(n-> n < 11);
        System.out.println(allMatch);

        boolean aleninMatch = nameList.stream().anyMatch(n -> n.contains("Аленин"));

        if (aleninMatch){
            System.out.println("Аленин в списке");
        }

        System.out.println("_________________________\n");

        System.out.println("findFirst() findAny()");
        List<String> firstName = nameList.stream().findFirst().stream().collect(Collectors.toList());
        List<String> anyName = nameList.stream().findAny().stream().collect(Collectors.toList());
        System.out.println(firstName);
        System.out.println(anyName);

        System.out.println("_________________________\n");







    }
}
