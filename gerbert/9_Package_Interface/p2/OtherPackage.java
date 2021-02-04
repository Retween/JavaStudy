package p2;

public class OtherPackage {

  OtherPackage() {
    p1.Protection p = new p1.Protection();

    System.out.println("Конструктор из другого пакета");
//    System.out.println("p.n = " + p.n); доступно только для данного класа или пакета
//    System.out.println("p.n = " + p.n_pri); доступно только для данного класса
//    System.out.println("p.n = " + p.n_pro); доступно только данного класса, подкласса, пакета
    System.out.println("p.n_pub = " + p.n_pub);
  }

}
