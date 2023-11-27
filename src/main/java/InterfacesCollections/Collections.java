package InterfacesCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        String[] names = new String[5];

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Федор");
        nameList.add("Лиза");
        nameList.set(0, "Андрей");
        System.out.println(nameList);

        HashSet<String> nameList1 = new HashSet<>();
        nameList1.add("Федор");
        nameList1.add("Лиза");
        boolean has = nameList1.contains("Федор");
        if (has == true) {
            System.out.println(nameList1);
        }

        // Создаем Map
        Map<String, Integer> map = new HashMap<>();
        // Добавляем элементы в Map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        // Печать Map
        System.out.println("Map: " + map);
        // Получаем значение для определенного ключа
        int value = map.get("banana");
        System.out.println("Value for 'banana': " + value);
        // Удаляем элемент из Map
        map.remove("orange");
        // Печать обновленной карты
        System.out.println("Map: " + map);


    }
}
