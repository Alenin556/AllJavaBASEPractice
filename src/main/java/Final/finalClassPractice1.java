package Final;

public final class finalClassPractice1 {
    public final String name = "Andrew";
    public String name2 = "Matvei";

    public void setName2(String name2) {
        this.name2 = name2;
    }

    //если класс final то и методы все становятся final
    public void printText() {
        System.out.println("text: final1");
    }
}
