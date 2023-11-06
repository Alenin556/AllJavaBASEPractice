package StackQueueDequeue;

import java.util.Stack;

public class StackExample {
    public static void main(String a[]) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Стек : " + stack); // []
        System.out.println("Стек пуст : " + stack.isEmpty()); // true
        System.out.println("");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Стек :  " + stack); // [1,2,3,4]
        System.out.println("");

        // peek(): смотрит и не удаляет объект из массива
        System.out.println("peek() : " + stack.peek()); // 4
        System.out.println("Стек :  " + stack); // [1,2,3,4]
        System.out.println("");

        // pop(): удаляет объект c конца стека и возвращает этот объект в качестве значения
        System.out.println("pop() : " + stack.pop()); // 4
        System.out.println("После pop() : " + stack); // [1,2,3]
        System.out.println("");

        //int search(Object o) : возвращает позицию c конца, начиная с 1.
        System.out.println("search(1) Operation : " + stack.search(1)); // 3
        System.out.println("search(3) Operation : " + stack.search(3)); // 1
        System.out.println("");

        System.out.println("Стек :  " + stack); // [1,2,3]
        System.out.println("Стек не пуст : " + stack.isEmpty()); // false
    }
}
