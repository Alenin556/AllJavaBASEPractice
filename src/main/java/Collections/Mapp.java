package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        // Создаем Map
        Map<String, Integer> map = new LinkedHashMap<>();

        // Добавляем элементы в Map
        map.put("apple", 35);
        map.put("banana", 56);
        map.put("orange", 50);
        map.put("orange", 50);

        // Печать Map
        System.out.println("Map: " + map);

        // Получаем значение для определенного ключа
        int price = map.get("banana");
        System.out.println("Price 'banana': " + price);

        // Удаляем элемент из Map
        map.remove("orange");

        // Печать обновленной карты
        System.out.println("Map: " + map);

        System.out.println(map.values());

        System.out.println("__________");

        for(String key: map.keySet()){
            System.out.println(map.get(key));
            System.out.println(key);
        }

        System.out.println("___________");

    }
}
