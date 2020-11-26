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

        if (this.isMultipleOfFirstSpecialNumber(orderNum)) {
            result.append(FIZZ);
        }

        if (this.isMultipleOfSecondSpecialNumber(orderNum)) {
            result.append(BUZZ);
        }

        if (this.isMultipleOfThirdSpecialNumber(orderNum)) {
            result.append(WHIZZ);
        }

        if (result.length() == 0) {
            return String.valueOf(orderNum);
        }

        return result.toString();
    }

    private boolean isMultipleOfFirstSpecialNumber(int orderNum) {
        return orderNum % FIRST_SPECIAL_NUM == 0;
    }

    private boolean isMultipleOfSecondSpecialNumber(int orderNum) {
        return orderNum % SECOND_SPECIAL_NUM == 0;
    }

    private boolean isMultipleOfThirdSpecialNumber(int orderNum) {
        return orderNum % THIRD_SPECIAL_NUM == 0;
    }
}
