package Collections;

public class HashMapp {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> passportsAndNames = new java.util.HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(212134, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Ваня Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        System.out.println(passportsAndNames);
        System.out.println();
        System.out.println(passportsAndNames.get(212133).hashCode());
        System.out.println(passportsAndNames.get(212134).hashCode());


    }
}