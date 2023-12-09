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

        //таблица Param
        //поиск по ключу и вывод значения для ввода в параметр

        Map<String, String> params = new HashMap<>();

        // Добавляем элементы в Map
        params.put("isActive", "true");
        params.put("type","debet");
        params.put("type","credit");
        params.put("type","virtual");

        for(String keyName: params.keySet()){
            System.out.println(keyName);
            System.out.println(params.get(keyName));
        }


        System.out.println("_____________");


        //таблица Param
        //поиск по ключу и вывод значения для ввода в параметр
        Map<String, String> params2 = new HashMap<>();

        // Добавляем элементы в Map
        params2.put("isActive", "true");
        params2.put("type","debet");
        params2.put("type","credit");
        params2.put("type","virtual");

        for(String keyName: params.keySet()){
            String arrayKeyName = keyName;
            System.out.println(arrayKeyName);
        }
    }
}
