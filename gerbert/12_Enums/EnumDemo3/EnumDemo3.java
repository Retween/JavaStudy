package EnumDemo3;

enum Apple {
  Jonathan(10), GoldenDel(9), Winesap(15), Cortland(8), RedDel(12), Altai;


  private final int price;

  Apple(int p) {
    price = p;
  }

  Apple() {
    price = -1;
  }

  int getPrice() {
    return price;
  }
}

public class EnumDemo3 {

  public static void main(String[] args) {
    Apple ap;

    System.out.println("Яблоко сорта Winesap стоит " + Apple.Winesap.getPrice() + " центов");

    System.out.println("Цены всех сортов яблок:");
    for (Apple x : Apple.values()) {
      System.out.println(x + " стоит " + x.getPrice() + " центов");
    }
  }
}
