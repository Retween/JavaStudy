enum Apple {
  Jonathan, GoldenDel, Winesap, Cortland, RedDel


}

public class EnumDemo {

  public static void main(String[] args) {

    Apple ap;

    ap = Apple.RedDel;

    System.out.println("Значение ap:" + " " + ap);
    System.out.println();

    ap = Apple.GoldenDel;

    if (ap == Apple.GoldenDel) {
      System.out.println("Переменная ap содержит GoldenDel\n");
    }

    switch (ap) {
      case Jonathan -> System.out.println("Сорт Jonathan красный");
      case GoldenDel -> System.out.println("Сорт Golden Delicious желтый");
      case RedDel -> System.out.println("Сорт Red Delicious красный");
      case Winesap -> System.out.println("Сорт Winesap красный");
      case Cortland -> System.out.println("Сорт Cortland красный");
    }

  }
}
