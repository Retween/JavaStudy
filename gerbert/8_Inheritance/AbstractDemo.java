abstract class A4 {

  abstract void callme();

  void callmetoo() {
    System.out.println("Это конкретный метод");
  }
}

class B4 extends A4 {

  void callme() {
    System.out.println("Реализация метода в классе В");
  }
}

public class AbstractDemo {

  public static void main(String[] args) {
    B4 b = new B4();

    b.callme();
    b.callmetoo();
  }
}
