package StackQueueDequeue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    /*public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");

        //возьмет первый город
        System.out.println(queue.peek());

        String town;
        //роll() - возвращает элемент из головы очереди и удаляет его.
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }

     */

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>() {
        };
        System.out.println("Очередь : " + queue1); // []
        System.out.println("Очередь пуста : " + queue1.isEmpty()); // true
        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);
        queue1.offer(4);

        System.out.println("Очередь : " + queue1); // [1,2,3,4]
        System.out.println("");
        // peek() и element(): возвращают объект с начала очереди и не удаляют его
        System.out.println("element() : " + queue1.element()); // 1
        System.out.println("Очередь : " + queue1); // [1,2,3,4]
        System.out.println("");

        // pop() и remove(): удаляет объект из верхней части стека и возвращает этот объект в качестве значения
        System.out.println("poll() : " + queue1.poll()); // 1
        System.out.println("Очередь после poll() : " + queue1); // [2,3,4]
        System.out.println("");

        //сontains(Object o) : проверит наличие значение в массиве, вернет true если такой имеется, иначе false
        System.out.println("сontains(2) : " + queue1.contains(2)); // true
        System.out.println("");

        System.out.println("Очередь : " + queue1); // [2,3,4]
        System.out.println("Очередь не пуста : " + queue1.isEmpty()); // false
    }

}

