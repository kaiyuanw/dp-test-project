package edu.utexas.ece;

import static org.junit.Assert.*;

import org.junit.Test;

public class BirdTest {
    @Test
    public void testSay() {
        Bird bird = new Bird("Michael", 4);
        assertEquals(bird.say(), "Biu");
    }
}
