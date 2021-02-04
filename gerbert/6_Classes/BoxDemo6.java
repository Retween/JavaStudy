class BoxC {

  double width;
  double height;
  double depth;

  BoxC() {
    width = 10;
    height = 10;
    depth = 10;
  }

  //Объем
  double volume() {
    return width * height * depth;
  }

  //установить размеры

}

public class BoxDemo6 {

  public static void main(String[] args) {

    BoxC mybox1 = new BoxC();
    BoxC mybox2 = new BoxC();
    double vol;

    vol = mybox1.volume();
    System.out.println("Объем равен "+ vol);

    vol = mybox2.volume();
    System.out.println("Объем равен " + vol);
  }

}
