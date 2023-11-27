package ConstructorObjectInterfacePractice;

public class Human extends SuperHuman{
    @Override
    void sayThatIamSuperHuman() {
        System.out.println("I'm Superman");
    }
    public static void main(String[] args) {
        Human superHuman = new Human();
        superHuman.fly();
        System.out.println(superHuman.lifeAges);
        superHuman.sayThatIamSuperHuman();
    }


}
