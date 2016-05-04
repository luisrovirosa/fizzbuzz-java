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
        assertIsBuzz(5);
    }

    @Test
    public void ten_is_buzz() {
        assertIsBuzz(10);
    }

    @Test
    public void twenty_is_buzz() {
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