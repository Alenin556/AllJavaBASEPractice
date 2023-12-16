package OOP.inheritance.lesson9;

public class Shepherd extends Dog{
    public Shepherd() {
        super( 28);
    }

    @Override
    public void run() {
        System.out.println("Овчарка бежит быстро.");
    }

    @Override
    public void breath() {
        System.out.println("Овчарка дышит.");
    }
    public void beAngry(){

    }
}
