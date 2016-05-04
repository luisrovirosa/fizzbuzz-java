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
        assertSameValue(1);
    }
    @Test
    public void two_is_two(){
        assertSameValue(2);
    }

    @Test
    public void four_is_four(){
        assertSameValue(4);
    }

    @Test
    public void three_is_fizz(){
        assertEquals("Fizz", values[2]);
    }



    private void assertSameValue(int number){
        assertEquals(String.valueOf(number), values[number - 1]);
    }
}