package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int FIRST_SPECIAL_NUM = 3;
    public static final int SECOND_SPECIAL_NUM = 5;
    public static final int THIRD_SPECIAL_NUM = 7;

    public String countOff(int orderNum) {
        boolean multipleOfFirstSpecialNum = orderNum % FIRST_SPECIAL_NUM == 0;
        boolean multipleOfSecondSpecialNum = orderNum % SECOND_SPECIAL_NUM == 0;
        boolean multipleOfThirdSpecialNum = orderNum % THIRD_SPECIAL_NUM == 0;

        if (multipleOfFirstSpecialNum) {
            if(multipleOfSecondSpecialNum && multipleOfThirdSpecialNum) {
                return FIZZ+BUZZ+WHIZZ;
            }

            if(multipleOfSecondSpecialNum) {
                return FIZZ+BUZZ;
            }

            if(multipleOfThirdSpecialNum) {
                return FIZZ+WHIZZ;
            }

            return FIZZ;
        }
        if (multipleOfSecondSpecialNum) {
            if(multipleOfThirdSpecialNum) {
                return BUZZ+WHIZZ;
            }
            return BUZZ;
        }
        if (multipleOfThirdSpecialNum) {
            return WHIZZ;
        }

        return String.valueOf(orderNum);
    }
}
