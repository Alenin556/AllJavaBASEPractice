package OOP.inheritance.lesson9;

public class Runner {
    public static void main(String[] args) {

        //Пудель
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeeth);
        System.out.println("");

        //Овчарка
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        System.out.println(shepherd.countTeeth);

    }
}
