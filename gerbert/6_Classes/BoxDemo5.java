class Box1 {

  double width;
  double height;
  double depth;

  //Объем
  double volume() {
    return width * height * depth;
  }

  //установить размеры
  void setDim(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

}

public class BoxDemo5 {

  public static void main(String[] args) {

    Box1 mybox1 = new Box1();
    Box1 mybox2 = new Box1();
    double vol;

    mybox1.setDim(10, 20, 15);
    mybox2.setDim(3, 6, 9);

    vol = mybox1.volume();
    System.out.println("Объем первого равен " + vol);

    vol = mybox2.volume();
    System.out.println("Объем второго равен " + vol);

  }
}
