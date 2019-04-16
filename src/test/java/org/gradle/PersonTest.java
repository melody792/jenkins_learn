package org.gradle;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PersonTest {
    String testStr = "Larry1";

    boolean flag = false;
    @Before
    public void befor(){
        Random random = new Random();
        flag = random.nextBoolean();
        testStr = flag ? "Larry" :"Larry1";
    }

    @Test
    public void canConstructAPersonWithAName() {

        Person person = new Person("Larry");
        System.out.println("flag="+flag);
        assertEquals(testStr, person.getName());
    }

    @Test
    public void customTest() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
