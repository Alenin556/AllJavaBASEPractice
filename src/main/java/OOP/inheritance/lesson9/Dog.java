package OOP.inheritance.lesson9;


//если класс является абстрактным, то мы больше не сможем создавать экземпляр этого класса.
public abstract class Dog extends Alive{

    public int countLegs = 4;
    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void beAngry() {
        System.out.println("Рычит");
    }
    public void bark() {
        System.out.println("Собака лает");
    }

    public abstract void run(); //абстрактный метод, это метод у которого нет реализации внутри абстрактного класса
    // реализация метода происходит внутри классов наследников
}
