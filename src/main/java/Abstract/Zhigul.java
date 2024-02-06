package Abstract;

public class Zhigul extends Car{

    public Zhigul(int speed) {
        super(speed);
    }

    @Override
    void drive() {
        System.out.println("Машина не завелась");
    }

    @Override
    void music() {
        System.out.println("В машине нет музыки");
    }
}
