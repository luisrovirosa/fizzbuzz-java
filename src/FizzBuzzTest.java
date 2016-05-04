import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_contains_one_hundred_elements(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(100, fizzBuzz.values().length);
    }
}