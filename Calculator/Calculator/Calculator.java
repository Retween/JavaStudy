package Calculator;

class Calculator {

  private final int a;
  private final int b;
  private final String operator;


  public Calculator(int a, int b, String operator) {
    this.a = a;
    this.b = b;
    this.operator = operator;
  }

  public int calculate() {
    return switch (operator) {
      case "+" -> a + b;
      case "-" -> a - b;
      case "*" -> a * b;
      case "/" -> a / b;
      default -> 0;
    };
  }
}
