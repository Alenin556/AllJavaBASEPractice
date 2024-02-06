package Abstract;

public abstract class Car {

    int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void showSpeed(int speed){
        this.speed = speed;
    }

    abstract void drive();
    abstract void music();
}
