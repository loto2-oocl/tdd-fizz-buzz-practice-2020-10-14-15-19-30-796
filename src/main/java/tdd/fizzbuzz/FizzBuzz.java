package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int FIRST_SPECIAL_NUM = 3;
    public static final int SECOND_SPECIAL_NUM = 5;
    public static final int THIRD_SPECIAL_NUM = 7;

    public String countOff(int orderNum) {
        StringBuilder result = new StringBuilder();

        boolean multipleOfFirstSpecialNum = orderNum % FIRST_SPECIAL_NUM == 0;
        boolean multipleOfSecondSpecialNum = orderNum % SECOND_SPECIAL_NUM == 0;
        boolean multipleOfThirdSpecialNum = orderNum % THIRD_SPECIAL_NUM == 0;

        if (multipleOfFirstSpecialNum) {
            result.append(FIZZ);
        }

        if (multipleOfSecondSpecialNum) {
            result.append(BUZZ);
        }

        if (multipleOfThirdSpecialNum) {
            result.append(WHIZZ);
        }

        if(result.length() == 0) {
            return String.valueOf(orderNum);
        }

        return result.toString();
    }
}
