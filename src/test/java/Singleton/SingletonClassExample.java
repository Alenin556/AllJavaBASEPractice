package Singleton;

public class SingletonClassExample {

    private static SingletonClassExample instanceOfSingletonClassExample = null;

    private SingletonClassExample()
    {
        System.out.println("Object created.");
    }

    public static SingletonClassExample getInstanceOfSingletonClassExample()
    {
        if (instanceOfSingletonClassExample == null)
            instanceOfSingletonClassExample = new SingletonClassExample();

        return instanceOfSingletonClassExample;
    }

    public static void main(String[] args) {
        SingletonClassExample first= SingletonClassExample.getInstanceOfSingletonClassExample();
        SingletonClassExample second= SingletonClassExample.getInstanceOfSingletonClassExample();
    }
}
