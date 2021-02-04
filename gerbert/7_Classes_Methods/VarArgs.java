//11 Продемонстрировать применение аргументов
//    11 переменной длины
public class VarArgs {

  //  теперь метод vaTest() объявляется с аргументами
//11 переменной длины
  static void vaTest(int... v) {
    System.out.println("Количество аргументов: " + v.length + " Содержимое:");

    for (int x : v) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    vaTest(1, 2, 3);
    vaTest(10);
    vaTest();
  }

}
