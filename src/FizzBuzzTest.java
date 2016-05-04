import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_contains_one_hundred_elements(){
        assertEquals(100, fizzBuzz.values().length);
    }

    @Test
    public void one_is_one(){
        assertEquals("1", fizzBuzz.values()[0]);
    }
    @Test
    public void two_is_two(){
        assertEquals("2", fizzBuzz.values()[1]);
    }
}