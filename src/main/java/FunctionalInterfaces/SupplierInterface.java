package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () ->(12);
        System.out.println(supplier.get());
    }
}
