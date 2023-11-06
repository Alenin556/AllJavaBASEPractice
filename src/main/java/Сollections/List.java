package Сollections;

import java.util.ArrayList;

public class List<S> {
    public static void main(String[] args) {
        String[] names = new String[5];

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Федор");
        nameList.add("Лиза");
        nameList.add("Елена");
        nameList.set(0, "Андрей");
        System.out.println(nameList);
    }
}
