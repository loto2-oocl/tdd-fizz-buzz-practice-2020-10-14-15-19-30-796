package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int orderNum) {
        if (orderNum % 3 == 0) {
            return FIZZ;
        }

        if (orderNum % 5 == 0) {
            return BUZZ;
        }

        if (orderNum % 7 == 0) {
            return WHIZZ;
        }

        return String.valueOf(orderNum);
    }
}
