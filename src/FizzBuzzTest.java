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
    public void basic_values_are_the_number_as_string() {
        assertSameValue(1);
        assertSameValue(2);
        assertSameValue(4);
    }

    @Test
    public void numbers_divisible_by_three_but_not_by_five_are_fizz() {
        assertIsFizz(3);
        assertIsFizz(6);
        assertIsFizz(9);
    }

    @Test
    public void numbers_divisible_by_five_but_not_by_three_are_buzz() {
        assertIsBuzz(5);
        assertIsBuzz(10);
        assertIsBuzz(20);
    }

    @Test
    public void fifteen_is_fizzbuzz() {
        assertIsFizzBuzz(15);
    }

    private void assertSameValue(int number) {
        assertExpectedValue(String.valueOf(number), number);
    }

    private void assertIsFizz(int number) {
        assertExpectedValue("Fizz", number);
    }

    private void assertIsBuzz(int number) {
        assertExpectedValue("Buzz", number);
    }

    private void assertIsFizzBuzz(int number) {
        assertExpectedValue("FizzBuzz", number);
    }

    private void assertExpectedValue(String expected, int number) {
        assertEquals(expected, values[number - 1]);
    }
}