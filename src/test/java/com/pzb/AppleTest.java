package com.pzb;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AppleTest {
    String testStr = "Larry1";

    boolean flag = false;
    @Before
    public void before(){
        Random random = new Random();
        flag = random.nextBoolean();
        testStr = flag ? "Larry" :"Larry1";
    }

    @Test
    public void canConstructAAppleWithAName() {

        Apple apple = new Apple("Larry");
        System.out.println("flag="+flag);
        assertEquals(testStr, apple.getName());
    }

    @Test
    public void customTest() {
        Apple apple = new Apple("Larry");
        assertEquals("Larry", apple.getName());
    }
}