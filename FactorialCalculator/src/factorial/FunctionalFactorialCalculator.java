package factorial;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FunctionalFactorialCalculator implements FactorialCalculator{
  public BigInteger compute(int number) {
    validateInput(number);

    return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
            .limit(number)
            .reduce(BigInteger.ONE, BigInteger::multiply);
  }
}
