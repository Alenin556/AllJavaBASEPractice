package Сollections;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        // Создаем Map
        java.util.Map<String, Integer> map = new HashMap<>();

        // Добавляем элементы в Map
        map.put("apple", 35);
        map.put("banana", 56);
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
    }
}
