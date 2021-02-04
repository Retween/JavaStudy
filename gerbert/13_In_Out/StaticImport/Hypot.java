package StaticImport;

import static java.lang.Math.*;

public class Hypot {

  public static void main(String[] args) {
    double side1, side2, hypot;
    side1 = 3.0;
    side2 = 4.0;

    hypot = sqrt(pow(side1, 2) + pow(side2, 2));
    System.out.println(hypot);
  }
}
