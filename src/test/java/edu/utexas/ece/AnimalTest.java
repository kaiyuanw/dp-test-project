package edu.utexas.ece;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
    Animal animal;

    @Before
    public void setUp() {
        animal = new Animal() {
                public String say() {
                    return "";
                }
            };
    }

    @Test
    public void testSetGetName() {
        assertTrue(animal.getName() == null);
        animal.setName("Nick");
        assertEquals(animal.getName(), "Nick");
    }

    @Test
    public void testSetGetAge() {
        assertEquals(animal.getAge(), 0);
        animal.setAge(10);
        assertEquals(animal.getAge(), 10);
    }
}
