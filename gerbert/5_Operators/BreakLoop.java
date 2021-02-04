public class BreakLoop {

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      if (i == 10) {
        break;
      }
      System.out.println("i = " + i);
    }
    System.out.println("Цикл завершен");

    int j = 0;
    while (j < 100) {
      if (j == 10) {
        break;
      }
      System.out.println("j = " + j);
      j++;
    }
    System.out.println("Цикл завершен");


  }
}
