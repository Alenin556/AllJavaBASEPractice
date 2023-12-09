package tests.OrderTag;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Smoke")
public class TestTag {

    @Test
    @DisplayName("Api test")
    @Tag("api")
    public void testapi(){
        System.out.println("Api tests run successfully");
    }

    @Test
    @DisplayName("Api test")
    @Tag("HighPriority")
    @Tag("api")
    public void highPriorityTest(){
        System.out.println("HighPriority tests run successfully");
    }

    @Test
    @DisplayName("Gui test")
    @Tag("MiddlePriority")
    @Tag("gui")
    public void testgui(){
        System.out.println("Gui tests run successfully");
    }
}
