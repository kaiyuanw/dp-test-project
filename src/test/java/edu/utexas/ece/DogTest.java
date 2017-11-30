package edu.utexas.ece;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {
    @Test
    public void testSay() {
        Dog dog = new Dog("Amber", 2);
        assertEquals(dog.say(), "Woof");
    }
}
