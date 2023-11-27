package ConstructorObjectInterfacePractice;

public interface Actions {

    int constant = 13;

    public void fight();

    public void say();

    public void run();

    default void runner(){
        System.out.println("Im default method in interface");
    }
    static int method(){
        System.out.println("Im static method in interface and I can return final static constants");
        return constant;
    }
}
