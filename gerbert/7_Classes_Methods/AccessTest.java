class Test2 {

  int a;
  public int b;
  private int c;

  void setC(int i) {
    c = i;
  }

  int getC() {
    return c;
  }

}

public class AccessTest {

  public static void main(String[] args) {

    Test2 ob = new Test2();

    ob.a = 10;
    ob.b = 20;

//    ob.c = 100;//Ошибка
    ob.setC(100);
    System.out.println("a, b, c " + " " + ob.a + " " + ob.b + " " + ob.getC());

  }
}
