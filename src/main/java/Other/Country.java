package Other;

public class Country {
    public static void main(String[] args) {
        String country = "US";
        int age = 42;

        if ((country == "US" || country == "RUS") && (age >= 16 && age < 100)) {
            System.out.println("Allowed");
        }
    }
}
