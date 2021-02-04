class BoxC1 {

  final double width;
  final double height;
  final double depth;

  BoxC1(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }


  double volume() {
    return width * height * depth;
  }

}

public class BoxDemo7 {

  public static void main(String[] args) {

    BoxC1 mybox1 = new BoxC1(10, 20, 15);
    BoxC1 mybox2 = new BoxC1(3, 6, 9);
    double vol;

    vol = mybox1.volume();
    System.out.println("Объем равен " + vol);

    vol = mybox2.volume();
    System.out.println("Объем равен " + vol);


  }

}
