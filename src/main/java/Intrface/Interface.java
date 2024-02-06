package Intrface;

public class Interface implements Intr, Intr2 {
    public static void main(String[] args) {
        Interface inter = new Interface();
        inter.method();
    }
    @Override
    public void method() {
        Intr.super.method();
    }
}
