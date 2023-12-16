package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class StreamInitialization {

    public static void main(String[] args) {


        //1. Создание пустого потока с помощью метода Stream.empty()
        //Можно создать пустой поток для использования на более поздних этапах кода.
        //Если использовать метод Stream.empty(), то будет сгенерирован пустой поток, не содержащий значений.
        Stream<String> str = Stream.empty();
        //Приведенный выше оператор сгенерирует пустой поток с именем str без каких-либо элементов внутри него.
        //Чтобы убедиться в этом достаточно проверить количество или размер потока с помощью термина str.count(). Например,
        System.out.println(str.count());
        System.out.println("_________________________\n");

        //2. Создание потока с использованием метода Stream.builder() с экземпляром Stream.Builder
        //Мы также можем использовать Stream Builder для создания потока с помощью шаблона проектирования builder.
        //Он предназначен для пошагового построения объектов.
        //Давайте посмотрим, как мы можем создать экземпляр потока с помощью Stream Builder.
        Stream.Builder<Integer> numBuilder = Stream.builder();

        numBuilder.add(1).add(2).add(3);

        Stream<Integer> numStream1 = numBuilder.build();
        numStream1.forEach(n -> System.out.println(n));
        System.out.println("_________________________\n");

        //3. Создание потока с указанными значениями с помощью метода Stream.of()
        //Еще один способ создания потока предполагает использование метода Stream.of().
        //Это простой способ создания потока с заданными значениями.
        //Он объявляет, а также инициализирует поток. Пример использования метода Stream.of() для создания потока:

        Stream<Integer> numStream2 = Stream.of(1, 2, 3);
        numStream2.forEach(n -> System.out.println(n));

        //Этот код создаст поток, содержащий элементы int, как мы уже сделали в предыдущем методе с использованием Stream.Builder.
        //Здесь мы напрямую создали поток, используя Stream.of() с заранее заданными значениями [1, 2 и 3].
        System.out.println("_________________________\n");

        //4. Создание потока из существующего массива с использованием метода Arrays.stream()
        //Другой распространенный метод создания потока предполагает использование массивов в Java.
        // Поток здесь создается из существующего массива с помощью метода Arrays.stream().
        // Все элементы массива преобразуются в элементы потока. Вот наглядный пример:

        Integer[] arr = {1, 2, 3, 4, 5};

        Stream<Integer> numStream3 = Arrays.stream(arr);
        numStream3.forEach(n -> System.out.println(n));
        System.out.println("_________________________\n");

        //5. Объединение двух существующих потоков с помощью метода Stream.concat()
        //Еще один метод, который можно использовать для создания потока, — это метод Stream.concat().
        //Он используется для объединения двух потоков с целью создания единого потока.

        //Оба потока объединяются по порядку.
        //Это означает, что первым идет первый поток, за которым следует второй поток, и так далее.
        // Пример такой конкатенации выглядит следующим образом:

        Stream<Integer> nummStream1 = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> nummStream2 = Stream.of(6, 7, 8);

        Stream<Integer> combinedStream = Stream.concat(nummStream1, nummStream2);
        combinedStream.forEach(n -> System.out.println(n));
        System.out.println("_________________________\n");

        //List
        List<String> dogs = new LinkedList<>();
        dogs.add("dog1");
        dogs.add("dog2");

        dogs.stream().map(n -> n + "Super dog").forEach(n -> System.out.println(n));

        System.out.println("_________________________\n");

        //Set
        Set<String> cats = new HashSet<>();
        cats.add("meow1");
        cats.add("meow2");

        cats.stream().map(n-> n + "Crazy cat").forEach(n -> System.out.println(n));

        System.out.println("_________________________\n");

        //HashMap
        Map<Integer,String> names1 = new HashMap<>();
        names1.put(1,"Igor");
        names1.put(2,"Masha");
        //при попытке поместить элементы с одинаковым ключом сохранится только один
        names1.put(2,"Masha");

        System.out.println(names1);

        System.out.println("_________________________\n");

        //LinkedHashMap
        Map<Integer,String> names2 = new LinkedHashMap<>();
        names2.put(123,"Walter");
        names2.put(1343,"Wally");

        System.out.println(names2);

        //TreeMap
        //элементы хранятся в отсортированном порядке по ключу
        Map<Integer,String> words = new TreeMap<>();
        words.put(1,"A");
        words.put(5,"C");
        words.put(2,"B");
        words.put(7,"D");
        words.put(8,"E");

        // с мапой нельзя создать стрим
//        words.stream();

        System.out.println(words);
        
    }
}
