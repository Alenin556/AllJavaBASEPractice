package OOP.inheritance.lesson9;

public class Poodle extends Dog{
    public Poodle() {
        super(30);
    }

    @Override
    public void run() {
        System.out.println("Пудель бежит медленно.");
    }

    @Override
    public void breath() {
        System.out.println("Пудель дышит.");
    }
}
