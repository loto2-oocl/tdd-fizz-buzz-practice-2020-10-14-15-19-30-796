package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNum) {
        if (orderNum % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(orderNum);
    }
}
