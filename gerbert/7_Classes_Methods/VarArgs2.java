public class VarArgs2 {

  static void vaTest(String msg, int... v) {
    System.out.println(msg + v.length + " Содержимое:");

    for (int x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    vaTest("Твое ебаное ", 10, 20, 30);
    vaTest("Один параметр переменной длины", 10);
    vaTest("Ноль параметров переменной длины ");
  }

}
