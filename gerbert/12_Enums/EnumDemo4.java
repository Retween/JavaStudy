//11 Продемонстрировать применение методов ordinal(),
//    11 compareTo() и equals()
public class EnumDemo4 {

  public static void main(String[] args) {
    Apple ap, ap2, ap3;

//    11 получить все порядковые значения
//    11 с помощью метода ordinal()
    for (Apple x : Apple.values()) {
      System.out.println(x + " " + x.ordinal());
    }

    ap = Apple.RedDel;
    ap2 = Apple.GoldenDel;
    ap3 = Apple.RedDel;

    System.out.println();

//    11 продемонстрировать применение
//    11 методов compareTo() и equals()
    if (ap.compareTo(ap2) < 0) {
      System.out.println(ap + " предшествует " + ap2);
    }
    if (ap.compareTo(ap2) > 0) {
      System.out.println(ap2 + " предшествует " + ap);
    }
    if (ap.compareTo(ap3) == 0) {
      System.out.println(ap + " равно " + ap3);
    }

    System.out.println();

    if (ap.equals(ap2)) {
      System.out.println("Ошибка");
    }
    if (ap.equals(ap3)) {
      System.out.println(ap + " равно " + ap3);
    }
    if (ap == ap3) {
      System.out.println(ap + " == " + ap3);
    }
  }

}
