package StreamAPI;

import java.util.List;

public class Names {
    public static void main(String[] args) {
        final List<String> list = List.of("Andrew", "Julia", "Max", "John");

        list.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() <= 4;
                })
                .map(s1 -> {
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                })
                .forEach(x -> {
                    System.out.println("forEach: " + x);
                });
    }
}
