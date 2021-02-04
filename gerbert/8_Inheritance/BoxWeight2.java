//Теперь в классе BoxWeight ключевое слово super
//    /!используется для инициализации собственных
// свойств объекта типа Вох

//Теперь в классе BoxWeight полностью
////реализованы все конструкторы
public class BoxWeight2 extends BoxOverload2 {

  double weight;

  BoxWeight2(BoxWeight2 ob) {//сконструировать клон объекта
    super(ob);
    weight = ob.weight;
  }

  //  инициализировать поля width, height и depth
// с помощью метода super
  BoxWeight2(double w, double h, double d, double m) {
    super(w, h, d);
    weight = m;
  }

  //конструктор по умолчанию
  BoxWeight2() {
    super();
    weight = -1;
  }

  //Конструктор при создании куба
  BoxWeight2(double len, double m) {
    super(len);
    weight = m;
  }

}

class DemoSuper {

  public static void main(String[] args) {
    BoxWeight2 mybox1 = new BoxWeight2(10, 20, 30, 34.3);
    BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.076);
    BoxWeight2 mybox3 = new BoxWeight2();
    BoxWeight2 mycube = new BoxWeight2(3, 2);
    BoxWeight2 myclone = new BoxWeight2(mybox1);
    double vol;

    vol = mybox1.volume();
    System.out.println("mybox1 vol = " + vol);
    System.out.println("mybox1.weight = " + mybox1.weight);
    System.out.println();

    vol = mybox2.volume();
    System.out.println("mybox2 vol = " + vol);
    System.out.println("mybox2.weight = " + mybox2.weight);
    System.out.println();

    vol = mybox3.volume();
    System.out.println("mybox3 vol = " + vol);
    System.out.println("mybox3.weight = " + mybox3.weight);
    System.out.println();

    vol = myclone.volume();
    System.out.println("myclone vol = " + vol);
    System.out.println("myclone.weight = " + myclone.weight);
    System.out.println();

    vol = mycube.volume();
    System.out.println("mycube vol = " + vol);
    System.out.println("mycube.weight = " + mycube.weight);
    System.out.println();

  }
}