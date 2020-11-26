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

    @Test
    void should_return_Fizz_when_count_off_given_order_num_of_multiple_of_first_special_num() {
        // given
        int orderNum = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(orderNum);

        // then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_num_of_multiple_of_second_special_num() {
        // given
        int orderNum = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(orderNum);

        // then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_num_of_multiple_of_third_special_num() {
        // given
        int orderNum = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(orderNum);

        // then
        assertEquals("Whizz", actual);
    }


    @Test
    void should_return_FizzBuzz_when_count_off_given_order_num_of_multiple_of_first_special_num_and_second_special_num() {
        // given
        int orderNum = 3 * 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(orderNum);

        // then
        assertEquals("FizzBuzz", actual);
    }
}
