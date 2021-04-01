package factorial;

import java.math.BigInteger;

public interface FactorialCalculator {
  BigInteger compute(int number);

  default BigInteger factorial(int number) {
    validateInput(number);

    return compute(number);
  }

  default void validateInput(int number){
    if(number < 0) {
      throw new ArithmeticException(
        "Factorial of a negative number is invalid");
    }
  }
}
