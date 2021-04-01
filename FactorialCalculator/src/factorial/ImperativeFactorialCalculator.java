package factorial;

import java.math.BigInteger;

public class ImperativeFactorialCalculator implements FactorialCalculator{
  @Override
  public BigInteger compute(int number){
    validateInput(number);
    
    var product = BigInteger.ONE;

    for (int i = 2; i <= number; i++) {
      product = product.multiply(BigInteger.valueOf(i));
    }

    return product;
  }
}
