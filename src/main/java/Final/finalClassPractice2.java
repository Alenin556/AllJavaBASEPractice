package Final;

public class finalClassPractice2 {
    public final String name = "Andrew";

    //final метод нельзя переписать только перегрузить
    public final void printText() {
        System.out.println("text: final2");
    }
    public final void printText(String text, String newText) {
        System.out.println("text: " + text + newText);
    }
}
