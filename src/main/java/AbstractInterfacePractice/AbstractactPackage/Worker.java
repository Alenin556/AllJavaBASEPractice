package AbstractInterfacePractice.AbstractactPackage;

public abstract class Worker {
    int id;
    String name;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    void info() {
        System.out.println("Info : " + id);
    }

    abstract void newInfo();

}
