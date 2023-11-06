package StackQueueDequeue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<String> lastNames = new LinkedList<>();
        lastNames.offer("Чехов");
        lastNames.offer("Пушкин");
        lastNames.offer("Скворцов");
        lastNames.offer("Сергеев");

        lastNames.addFirst("Смирнов");

        lastNames.addLast("Алексеев");

        lastNames.push("Демидов");

        System.out.println(lastNames);

        System.out.println(lastNames.getFirst());
        System.out.println(lastNames.getLast());

        System.out.println(lastNames.removeLastOccurrence("Демидов"));
        System.out.println(lastNames);


    }
}
