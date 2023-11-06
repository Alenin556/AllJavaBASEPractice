package Parametrized;

public class FaceControl {

        public String welcome(int age, int cash) {
            String welcome = "Welcome to our club.";
            String goHome = "Go home boy.";
            if (age >= 18 && cash >= 1000) {
                return welcome;
            }
            return goHome;
        }
    }
