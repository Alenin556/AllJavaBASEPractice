package Parametrized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;


public class FaceControlTest {
    @Test
    public void faceControlTest(){
        FaceControl control = new FaceControl();
        String expected = "Welcome to our club.";
        String actual = control.welcome(18,1500);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void faceControlFailTest(){
        FaceControl control = new FaceControl();
        String expected = "Go home boy.";
        String actual = control.welcome(17,100);

        Assertions.assertEquals(expected, actual);

    }
}
