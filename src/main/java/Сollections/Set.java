package Сollections;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> nameList = new HashSet<>();
        nameList.add("Федор");
        nameList.add("Лиза");
        if (nameList.contains("Федор") == true) {
            System.out.println(nameList);
        }
    }
}
