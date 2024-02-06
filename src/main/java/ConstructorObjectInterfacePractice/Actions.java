package ConstructorObjectInterfacePractice;

public interface Actions {

    int constant = 13;

    public void fight();

    public void say();

    public void run();

    default void runner(){
        System.out.println("Im default Other.method in interface");
    }
    static int method(){
        System.out.println("Im static Other.method in interface and I can return final static constants");
        return constant;
    }
}
