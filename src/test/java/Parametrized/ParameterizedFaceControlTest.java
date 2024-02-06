package Parametrized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedFaceControlTest {


    @ParameterizedTest
    @CsvSource({
            "Welcome to our club.,18,1500",
            "Go home boy.,15,100"
    })
    public void faceControlTest(String expected, int age, int cash){
        FaceControl control = new FaceControl();
        String actual = control.welcome(age,cash);

        Assertions.assertEquals(expected, actual);
    }
}
