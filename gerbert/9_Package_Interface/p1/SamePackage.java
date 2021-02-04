package p1;

public class SamePackage {

  SamePackage() {
    Protection p = new Protection();

    System.out.println("Конструктор из того же самого пакета");
    System.out.println("p.n = " + p.n);
//    System.out.println("p.n_pri = " + p.n_pri); доступно только для класса
    System.out.println("p.n_pro = " + p.n_pro);
    System.out.println("p.n_pub = " + p.n_pub);
  }

}
