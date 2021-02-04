abstract class FigureAbstract {

  double dim1, dim2;

  FigureAbstract(double a, double b) {
    dim1 = a;
    dim2 = b;
  }

  abstract double area();
}

class RectangleA extends FigureAbstract {

  RectangleA(double a, double b) {
    super(a, b);
  }

  //переопределить метод area() для четырехугольника
  double area() {
    System.out.println("В области четырехугольника");
    return dim1 * dim2;
  }
}

class TriangleA extends FigureAbstract {

  TriangleA(double a, double b) {
    super(a, b);
  }

  //  переопределить метод area() для
  // прямоугольного треугольника
  double area() {
    System.out.println("В области треугольника");
    return dim1 * dim2 / 2;
  }
}

class AbstractAreas {

  public static void main(String[] args) {
//    FigureAbstract f = new FigureAbstract()   Теперь недоступно
    RectangleA r = new RectangleA(9, 5);
    TriangleA t = new TriangleA(10, 8);
    FigureAbstract figref;

    figref = r;
    System.out.println("Площадь равна " + figref.area());

    figref = t;
    System.out.println("Площадь равна " + figref.area());

  }
}