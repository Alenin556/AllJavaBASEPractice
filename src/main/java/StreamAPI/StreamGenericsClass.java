package StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamGenericsClass <T> {
    public <E> void test(Collection<E> collection) {
        for (E element : collection) {
            System.out.println(element);
        }
    }
    public void test(List<Integer> collection) {
        for (Integer element : collection) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        StreamGenericsClass<String> st = new StreamGenericsClass<>();
        List<String> list = Arrays.asList("test");
        st.test(list);

        StreamGenericsClass<Integer> integer = new StreamGenericsClass<>();
        List<Integer> listInt = Arrays.asList(1);
        st.test(listInt);
    }
}

