import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private String[] values;

    @Before
    public void setUp(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        values = fizzBuzz.values();
    }

    @Test
    public void should_contains_one_hundred_elements(){
        assertEquals(100, values.length);
    }

    @Test
    public void one_is_one(){
        assertEquals("1", values[0]);
    }
    @Test
    public void two_is_two(){
        assertEquals("2", values[1]);
    }
}