package Final;

public class finalClassPractice3 extends finalClassPractice2 {
    public final String name = "Andrew";

    //метод final может быть перегружен, но не может быть перезаписан
    public final void printText(String text) {
        System.out.println("text: " + text);
    }
}
