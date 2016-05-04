import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private String[] values;

    @Before
    public void setUp() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        values = fizzBuzz.values();
    }

    @Test
    public void should_contains_one_hundred_elements() {
        assertEquals(100, values.length);
    }

    @Test
    public void one_is_one() {
        assertSameValue(1);
    }

    @Test
    public void two_is_two() {
        assertSameValue(2);
    }

    @Test
    public void four_is_four() {
        assertSameValue(4);
    }

    @Test
    public void three_is_fizz() {
        assertIsFizz(3);
    }

    @Test
    public void six_is_fizz() {
        assertIsFizz(6);
    }

    @Test
    public void nine_is_fizz() {
        assertIsFizz(9);
    }

    @Test
    public void five_is_buzz() {
        assertExpectedValue("Buzz", 5);
    }

    @Test
    public void ten_is_buzz() {
        assertExpectedValue("Buzz", 10);
    }

    @Test
    public void twenty_is_buzz() {
        assertExpectedValue("Buzz", 20);
    }

    private void assertSameValue(int number) {
        assertExpectedValue(String.valueOf(number), number);
    }

    private void assertIsFizz(int number) {
        assertExpectedValue("Fizz", number);
    }

    private void assertExpectedValue(String expected, int number) {
        assertEquals(expected, values[number - 1]);
    }
}