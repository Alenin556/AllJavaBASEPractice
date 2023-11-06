package StreamAPI;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStream {
    public static void main(String[] args) {

        List<String> nameList = List.of("Андрей Аленин", "Максим Дроздов", "Николай Скворцов", "Андрей Кравцов");
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("_________________________");
        //map() Преобразование
        // n приравнивается к одному элементу коллекции для перебора (как при for each) и после -> мы указываем как фильтруется наша коллекция
        Stream<String> namesAndCity = nameList.stream().map(n -> n + " из Питера");
        Stream<Integer> numbers10 = numbersList.stream().map(n -> n * 10);

        namesAndCity.forEach(System.out::println);
        numbers10.forEach(System.out::println);

        System.out.println("_________________________");

        //filter() Фильтрация
        // Отсеивание части объектов можно сделать с помощью метода filter().
        // оставляет только те имена, в которых есть буква "..."
        Stream<String> filterNamesWithA = nameList.stream().filter(n -> n.contains("д"));
        // оставляет только те числа, которые больше 5
        Stream<Integer> filterNumbers = numbersList.stream().filter(n -> n < 5);

        filterNamesWithA.forEach(System.out::println);
        filterNumbers.forEach(System.out::println);

        System.out.println("_________________________");

        //count() Получение количества
        long countNames = nameList.stream().count();
        System.out.println(countNames);

        System.out.println("_________________________");

        //dictinct() Удаление дублей
        List<Integer> numbersList1 = List.of(11, 22, 29, 14, 25, 14, 27, 11, 22);
        Stream<Integer> distinctNumbers = numbersList1.stream().distinct();
        distinctNumbers.forEach(System.out::println);

        System.out.println("_________________________");

        //sorted() Сортировка
        //По умолчанию использует «натуральный порядок», т.е. сортировку по возрастанию.
        //sorted(Comparator.reverseOrder()) отсортирует набор в обратном порядке
        List<Integer> numbersList2 = List.of(11, 2, 9, 4, 15, 6, 7, 12, 1);
        Stream<Integer> sortedNumbers = numbersList2.stream().sorted();
        sortedNumbers.forEach(System.out::println);

        System.out.println("_________________________");

        //  Поток здесь создается из существующего массива с помощью метода Arrays.stream().
        //  Все элементы массива преобразуются в элементы потока.
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> numStream = Arrays.stream(arr).sorted(Comparator.reverseOrder());

        Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(System.out::println);// тоже самое что и numStream.forEach(System.out::println);
        numStream.forEach(System.out::println);




    }
}
