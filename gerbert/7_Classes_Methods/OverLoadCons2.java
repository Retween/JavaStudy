//  В этой версии класса Вох один объект допускается
//  инициализировать другим объектом
class BoxOverload2 {

  private double width;
  private double height;
  private double depth;

  //  Обратите внимание на этот конструктор. В качестве
//  параметра в нем используется объект типа Вох
  BoxOverload2(BoxOverload2 ob) {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

  //  конструктор, используемый, когда
//  указываются все размеры
  BoxOverload2(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  //  конструктор, используемый, если ни один из
//  размеров не указан
  BoxOverload2() {
    width = -1;
    height = -1;
    depth = -1;
  }

  //  конструктор, используемый при создании куба
  BoxOverload2(double len) {
    width = height = depth = len;
  }

  //  рассчитать и возвратить объем
  double volume() {
    return width * height * depth;
  }

}

public class OverLoadCons2 {

  public static void main(String[] args) {

    // создать параллелепипеды, используя
    // разные конструкторы
    BoxOverload2 mybox1 = new BoxOverload2(10, 20, 15);
    BoxOverload2 mybox2 = new BoxOverload2();
    BoxOverload2 mycube = new BoxOverload2(7);

    // создать копию объекта myboxl
    BoxOverload2 myclone = new BoxOverload2(mybox1);

    double vol;

    vol = mybox1.volume();
    System.out.println("Объем " + vol);
    vol = mybox2.volume();
    System.out.println("Объем " + vol);
    vol = mybox1.volume();
    System.out.println("Объем " + vol);
    vol = mybox1.volume();
    System.out.println("Объем " + vol);

  }
}
