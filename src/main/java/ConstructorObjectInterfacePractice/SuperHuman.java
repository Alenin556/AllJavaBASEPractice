package ConstructorObjectInterfacePractice;

public abstract class SuperHuman {

    String lifeAges = "Infinity";

    public void fly(){
        System.out.println("Fly in space");
    }

    public void teleportation(){
        System.out.println("Teleport in Egypt");
    }

    abstract void sayThatIamSuperHuman();

}
