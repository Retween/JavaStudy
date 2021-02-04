class BoxOverload {

  double width;
  double height;
  double depth;

  BoxOverload(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  BoxOverload() {
    width = -1;
    height = -1;
    depth = -1;
  }

  BoxOverload(double len) {
    width = height = depth = len;
  }

  double volume() {
    return width * height * depth;
  }

}

class OverloadCons {

  public static void main(String[] args) {

    BoxOverload2 mybox1 = new BoxOverload2(10, 20, 15);
    BoxOverload2 mybox2 = new BoxOverload2();
    BoxOverload2 mycube = new BoxOverload2(7);
    double vol;

    vol = mybox1.volume();
    System.out.println("Объем mybox1 равен " + vol);

    vol = mybox2.volume();
    System.out.println("Объем mybox2 равен " + vol);

    vol = mycube.volume();
    System.out.println("Объем mycube равен " + vol);

  }
}
