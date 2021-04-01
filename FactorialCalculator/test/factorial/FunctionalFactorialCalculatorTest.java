package factorial;

class FunctionalFactorialCalculatorTest implements FactorialCalculatorTest{
  @Override
  public FactorialCalculator newFactorialCalculator() {
    return new FunctionalFactorialCalculator();
  }
}
