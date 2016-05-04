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
        assertSameValue(0);
    }
    @Test
    public void two_is_two(){
        assertSameValue(1);
    }

    private void assertSameValue(int number){
        assertEquals(String.valueOf(number + 1), values[number]);
    }
}