package factorial;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public interface FactorialCalculatorTest {
  FactorialCalculator newFactorialCalculator();

  @Test
  default void canary(){
    assertTrue(true);
  }

  @Test
  default void ForLoopFactorialFunctionReturnsTheCorrectValues(){
    FactorialCalculator factorialCalculator = newFactorialCalculator();
    assertAll(
      () -> assertEquals(BigInteger.ONE, factorialCalculator.compute(0)),
      () -> assertEquals(BigInteger.ONE, factorialCalculator.compute(1)),
      () -> assertEquals(BigInteger.TWO, factorialCalculator.compute(2)),
      () -> assertEquals(BigInteger.valueOf(6), 
        factorialCalculator.compute(3)),
      () -> assertEquals(BigInteger.valueOf(120), 
        factorialCalculator.compute(5)),
      () -> assertEquals(BigInteger.valueOf(3628800), 
        factorialCalculator.compute(10))
    );
  }

  @Test
  default void ForLoopFactorialFunctionReturnsCorrectResultFor50() {
    FactorialCalculator factorialCalculator = newFactorialCalculator();
    assertEquals(new BigInteger(
        "30414093201713378043612608166064768844377641568960512000000000000"),
      factorialCalculator.compute(50));
  }

  @Test
  default void ForLoopFactorialFunctionThrowsIOExceptionForNegative1() {
    FactorialCalculator factorialCalculator = newFactorialCalculator();
    var ex = assertThrows(ArithmeticException.class,
      () -> factorialCalculator.compute(-1));

    assertEquals("Factorial of a negative number is invalid",
      ex.getMessage());
  }
}