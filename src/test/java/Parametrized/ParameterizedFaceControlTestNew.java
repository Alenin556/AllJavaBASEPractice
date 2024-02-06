package Parametrized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class ParameterizedFaceControlTestNew {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/faceControl.csv")
    public void faceControlTest(String expected, int age, int cash) {
        FaceControl control = new FaceControl();
        String actual = control.welcome(age, cash);

        Assertions.assertEquals(expected, actual);
    }
}

