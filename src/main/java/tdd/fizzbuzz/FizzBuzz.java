package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNum) {
        if (orderNum % 3 == 0) {
            return "Fizz";
        }

        if (orderNum % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(orderNum);
    }
}
