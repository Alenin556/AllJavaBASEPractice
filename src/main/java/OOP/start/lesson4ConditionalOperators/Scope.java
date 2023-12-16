package OOP.start.lesson4ConditionalOperators;

public class Scope {
    public static void main(String[] args) {
        double priceCar = 10_000;

        if(priceCar > 9_000) {
            priceCar *= 0.95;
            double newPrice = priceCar;
        }

        System.out.println(priceCar);

    }
}
