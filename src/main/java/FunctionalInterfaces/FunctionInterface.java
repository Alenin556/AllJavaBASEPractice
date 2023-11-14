package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {

        Function<Long, String> convert = x-> x.toString();
        System.out.println(convert.apply(5L)); // 5
        String phoneNumber = convert.apply(79315762030L);
        System.out.println(phoneNumber +" - номер телефона");
    }
}
