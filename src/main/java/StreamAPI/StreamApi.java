package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<String> list = List.of("Andrew", "Julia", "Max", "Andrew");
        Stream<String> distinctStream = list.stream().distinct();
        long count = list.stream().count();


        System.out.println("Список людей");
        list.forEach(System.out::println);
        System.out.println(count + " человек(а) в списке");

        System.out.println("");
        System.out.println("Список без дубликатов");
        distinctStream.forEach(System.out::println);
        System.out.println("");


        StreamApi streamApi = new StreamApi();
        List<String> dogsList = Arrays.asList("Jery", "Fogy", "Rex", "Lui");
        streamApi.count(dogsList); //количество собак
        streamApi.Names(dogsList); // их имена

    }
    public void count(List<String> list) {
        System.out.println( list.stream()
                .count());
    }

    public void Names(List<String> list) {
        list.stream()
                .forEach(System.out :: println);
    }
}
