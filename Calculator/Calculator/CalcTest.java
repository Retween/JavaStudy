package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CalcTest {

  static String[] inputArg = null;
  static String input, a, b, op;
  static int arg1, arg2, result;
  static boolean isRoman = false, isArabic = false;
  static Calculator calculator;

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      while (!(input = br.readLine()).equals("")) {
        inputArg = input.split(" ");

        checkInput();

        calculator = new Calculator(arg1, arg2, op);
        result = calculator.calculate();

        if (isArabic) {
          System.out.println(result);
        } else if (isRoman) {
          System.out.println(RomanNumbers.convertToRoman(result));
        }

        isRoman = false;
        isArabic = false;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void checkInput() {
    try {
      if (inputArg == null || inputArg.length != 3) {
        throw new IllegalArgumentException();
      } else {
        a = inputArg[0];
        b = inputArg[2];
        op = inputArg[1];
      }

      if ((a + b).replaceAll("[\\D]", "").equals(a + b)) {
        isArabic = true;
      }
      if ((a + b).replaceAll("[^XVI]+", "").equals(a + b)) {
        isRoman = true;
      }
      if (!op.replaceAll("[^/+*-]", "").equals(op) || op.length() != 1) {
        throw new IllegalArgumentException();
      }

      if (!isArabic && !isRoman) {
        throw new IllegalArgumentException();
      }

      if (isArabic) {
        arg1 = Integer.parseInt(a);
        arg2 = Integer.parseInt(b);
        if (arg1 < 1 || arg1 > 10 || arg2 < 1 || arg2 > 10) {
          throw new IllegalArgumentException();
        }
      }

      if (isRoman) {
        arg1 = RomanNumbers.valueOf(a).getValue();
        arg2 = RomanNumbers.valueOf(b).getValue();
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Неправильный запрос");
      System.exit(0);
    }
  }
}
