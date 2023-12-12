package Final;

public class finalClassPractice3 extends finalClassPractice2 {
    public final String name = "Andrew";

    //метод final может быть перегружен, но не может быть перезаписан
    public final void printText(String text) {
        System.out.println("text: " + text);
    }

    public final void printText(String text){ // исключение
        System.out.println("Text");
    }

    public final void printText(int number){ // нет исключения
        System.out.println("Text");
    }
}
