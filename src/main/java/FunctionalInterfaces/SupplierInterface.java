package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> new String("Hello");
        System.out.println(supplier.get());
    }
}
