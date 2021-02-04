
class Outer1 {

  int outer = 100;

  void test() {
    for (int i = 0; i < 10; i++) {
      class Inner1 {

        void display() {
          System.out.println("outer = " + outer);
        }
      }
      Inner1 inner = new Inner1();
      inner.display();
    }
  }
}

public class InnerClassFor {

  public static void main(String[] args) {
    Outer1 outer = new Outer1();
    outer.test();
  }
}
