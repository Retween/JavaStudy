//Аргументы переменной длины и перегрузка
public class VarArgs3 {


  static void vaTest(int... v) {
    System.out.println("Количество аргументов: " + v.length + " Содержимое:");

    for (int x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  static void vaTest(boolean... v) {
    System.out.println("vaTest(boolean ...): Количество аргументов" + v.length + " Содержимое:");

    for (boolean x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  static void vaTest(String msg, int... v) {
    System.out.println("vaTest(String, int ... v): " + msg + v.length + " Содержимое:");

    for (int x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    vaTest(1, 2, 3);
    vaTest("Проверка", 1, 3);
    vaTest(true, false, true);
  }
}
