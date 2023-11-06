package tests.Parallel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;


public class FirstParallelUnitTest{

    @Test
    public void first() throws Exception{
        System.out.println("FirstParallelUnitTest first() start => " + Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println("FirstParallelUnitTest first() end => " + Thread.currentThread().getName());
    }

    @Test
    public void second() throws Exception{
        System.out.println("SecondParallelUnitTest second() start => " + Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println("SecondParallelUnitTest second() end => " + Thread.currentThread().getName());
    }

    @Test
    public void third() throws Exception{
        System.out.println("ThirdParallelUnitTest third() start => " + Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println("ThirdParallelUnitTest third() end => " + Thread.currentThread().getName());
    }
}