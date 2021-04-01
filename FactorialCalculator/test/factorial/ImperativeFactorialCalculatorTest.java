package factorial;

class ImperativeFactorialCalculatorTest implements FactorialCalculatorTest{
  @Override
  public FactorialCalculator newFactorialCalculator() {
    return new ImperativeFactorialCalculator();
  }
}
