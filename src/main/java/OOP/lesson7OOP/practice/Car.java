package OOP.lesson7OOP.practice;

public class Car {
    //Создать класс машина с атрибутами "марка", "максимальная скорость". По умолчанию скорость 220.
    //Создать конструктор: на атрибут марка, марка и максимальная скорость.
    //Создать метод "разгон до 100": напечатать на экран "Скорость разгона до 100 км/ч: [значение]"
    //значение получаем по формуле: 110 / (максимальная скорость машины / 20).

    private String mark;
    private int maxSpeed = 220;

    public Car() {
    }

    public Car(String mark) {
        this.mark = mark;
    }

    public Car(String mark, int maxSpeed) {
        this.mark = mark;
        this.maxSpeed = maxSpeed;
    }
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void speed() {
        int result = 110 / (this.maxSpeed / 20);
        System.out.println("Скорость разгона до 100 км/ч: " + result + " cекунд.");
        }

    @Override
    public String toString() {
        return "AutoA{" +
                "mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
