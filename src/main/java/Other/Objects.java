package Other;

public class Objects {

    static String title;
    static String artist;

        static String setTitle(String newTitle) {
            title = newTitle;
            return newTitle;
        }

    public static void main(String[] args) {
        Objects s1 = new Objects();
        String title = s1.setTitle("Rock");
        System.out.println(title);}
}
