package AbstractInterfacePractice.AbstractactPackage;


public class Developer extends Worker {

    public Developer(int id, String name) {
        super(id, name);
    }

    @Override
    void newInfo() {
        System.out.println("New AQA developer :" + name);
    }

}
