package factorial;

import java.math.BigInteger;

public class RecursiveFactorialCalculator implements FactorialCalculator{
  @Override
  public BigInteger compute(int number) {
    validateInput(number);

    if (number == 0) {
      return BigInteger.ONE;
    }

    return BigInteger.valueOf(number).multiply(compute(number - 1));
  }
}
