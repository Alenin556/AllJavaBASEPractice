package Collections;

import java.util.LinkedList;
import java.util.List;

public class N {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1,3);
        numbers.add(1,5);
        System.out.println(numbers);
    }
}
