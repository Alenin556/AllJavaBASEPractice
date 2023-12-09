package tests.OrderTag;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrder {

    @Test
    @Order(1)
    public void a(){
        System.out.println("A");
    }


    @Test
    @Order(3)
    public void c(){
        System.out.println("C");
    }

    @Test
    @Order(2)
    public void b(){
        System.out.println("B");
    }
}
