package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Llist {
    public static void main(String[] args) {

        final List<Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(1.1);
        doubleNumbers.add(1.1);
        doubleNumbers.add(1.1);
        doubleNumbers.add(1.1);
        System.out.println(doubleNumbers);
//        doubleNumbers = new ArrayList<>(5); не может иметь ссылку на другую коллекцию



        String[] names = new String[5];

        LinkedList <String> namess = new LinkedList <>();
        namess.add("Привет");
        namess.add("!");
        namess.add("Как");
        namess.add("Твои");
        namess.add("Дела");
        namess.add("?");
        System.out.println(namess);

        namess.remove(1);
        System.out.println(namess);
        System.out.println("_____________________________________\n");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Федор");
        nameList.add("Лиза");
        nameList.add("Елена");
        nameList.add("Степан");
        nameList.add("Григорий");
        nameList.add("Владимир");
        nameList.add("Радомир");
        nameList.add("Никита");
        nameList.add("Валерий");
        nameList.add("Дмитрий");
        nameList.add("Оксана");
        nameList.set(0, "Андрей");
        System.out.println(nameList);

        System.out.println("_____________________________________\n");

        ArrayList<String> nameList2 = new ArrayList<>(5);
        nameList2.add("Федор");
        nameList2.add("Лиза");
        nameList2.add("Елена");
        nameList2.add("Степан");
        nameList2.add("Григорий");
        nameList2.add("Владимир");
        nameList2.add(5,"Никита");
        System.out.println(nameList2);
        System.out.println("_____________________________________\n");

        List<String> immutable_list = List.of("apple", "banana", "orange");

//  List.of() — это фабричный метод, впервые представленный в Java 9, который создает неизменяемый список, содержащий указанные элементы. Вот несколько ключевых моментов, на которые вам следует обратить внимание, изучая List.of():
//  Неизменяемость: полученный список неизменен, то есть его размер и элементы не могут быть изменены после создания.
//  Фиксированный размер: список, созданный List.of(), имеет фиксированный размер и не поддерживает добавление или удаление элементов.
//  Нулевые значение: List.of() не допускает нулевых элементов. Если вы попытаетесь добавить null, появится исключение NullPointerException.

        System.out.println(immutable_list.get(0));

        //  MAKE EXCEPTIONS ->
//        immutable_list.add(3,"cherry");
//        immutable_list.set(2,"cherry");
        System.out.println(immutable_list);
        System.out.println("_____________________________________\n");

    }
}
