package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_String_order_num_when_count_off_given_order_num() {
        // given
        int orderNum = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(orderNum);

        // then
        assertEquals("1", actual);
    }
}
