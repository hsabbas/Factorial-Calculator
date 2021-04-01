package factorial;

class RecursiveFactorialCalculatorTest implements FactorialCalculatorTest{
  @Override
  public FactorialCalculator newFactorialCalculator() {
    return new RecursiveFactorialCalculator();
  }
}
