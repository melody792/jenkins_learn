package org.gradle;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void customTest1() {
        Car car = new Car("Larry");
        assertEquals("Larry", car.getName());
    }

    @Test
    public void customTest2() {
        Car car = new Car("Larry");
        assertEquals("Larry", car.getName());
    }
}