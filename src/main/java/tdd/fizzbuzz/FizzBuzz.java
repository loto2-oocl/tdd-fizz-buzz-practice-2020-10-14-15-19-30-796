package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int FIRST_SPECIAL_NUM = 3;
    public static final int SECOND_SPECIAL_NUM = 5;
    public static final int THIRD_SPECIAL_NUM = 7;

    public String countOff(int orderNum) {
        if (orderNum % FIRST_SPECIAL_NUM == 0) {
            return FIZZ;
        }

        if (orderNum % SECOND_SPECIAL_NUM == 0) {
            return BUZZ;
        }

        if (orderNum % THIRD_SPECIAL_NUM == 0) {
            return WHIZZ;
        }

        return String.valueOf(orderNum);
    }
}
