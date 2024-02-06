package Abstract;

public class BMW extends Car{

    public BMW(int speed) {
        super(speed);
    }

    @Override
    public void showSpeed(int speed){
        this.speed = speed;
    }

    @Override
    void drive() {
        System.out.println("Едет быстро");
    }

    @Override
    void music() {
        System.out.println("В машине есть музыка");
    }
}
