package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNum) {
        if (orderNum % 3 == 0) {
            return "Fizz";
        }

        if (orderNum % 5 == 0) {
            return "Buzz";
        }

        if (orderNum % 7 == 0) {
            return "Whizz";
        }

        return String.valueOf(orderNum);
    }
}
