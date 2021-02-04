class Outer {

  int outer_x = 100;

  void Test() {
    Inner inner = new Inner();
    inner.display();
  }

  class Inner {

    void display() {
      System.out.println("вывод outer_x " + outer_x);
    }
  }

}

public class InnerClaccDemo {

  public static void main(String[] args) {

    Outer outer = new Outer();
    outer.Test();

  }
}
