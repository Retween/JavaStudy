//В этой программе наследование применяется
//для расширения класса Вох
class BoxWeight extends BoxOverload2 {

  double weight;

//  BoxWeight(double w, double h, double d, double m) {
//    width = w;
//    height = h;
//    depth = d;
//    weight = m;
//  }
}

public class DemoBoxWeight {

  public static void main(String[] args) {
    BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.3);
    BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.076);
    double vol;

    vol = mybox1.volume();
    System.out.println("Объем mybox1 равен " + vol);
    System.out.println("Вес mybox1 равен " + mybox1.weight);

    System.out.println();

    vol = mybox2.volume();
    System.out.println("Объем mybox2 равен " + vol);
    System.out.println("Вес mybox2 равен " + mybox2.weight);
  }
}
