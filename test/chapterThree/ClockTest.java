package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ClockTest {
    private Clock clock;
    @BeforeEach
    public void setUp(){
     clock = new Clock(5,35,24);
    }
    @Test
    public void clockCanBeCreated(){
        Clock clock = new Clock(4,35,25);
        assertNotNull(clock);

    }@Test
    public void clockIsEmpty(){
        assertFalse(clock.isEmpty());
    }
}
