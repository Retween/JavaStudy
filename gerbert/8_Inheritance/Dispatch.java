class A3 {

  void callme() {
    System.out.println("В методе callme() из класса A");
  }
}

class B3 extends A3 {

  void callme() {
    System.out.println("В методе callme() из класса B");
  }
}

class C3 extends A3 {

  void callme() {
    System.out.println("В методе callme() из класса C");
  }
}

public class Dispatch {

  public static void main(String[] args) {
    A3 a = new A3();
    B3 b = new B3();
    C3 c = new C3();

    A3 r;  //! получить ссылку на объект типа А

    r = a;      // переменная r ссылается на объект типа А
    r.callme(); // вызвать вариант метода callme(), определенный в классе A

    r = b;      // переменная r ссылается на объект типа B
    r.callme(); // вызвать вариант метода callme(),определенный в классе B

    r = c;      // переменная r ссылается на объект типа C
    r.callme(); // вызвать вариант метода callme(),определенный в классе C
  }
}
