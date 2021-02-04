public class Switch {

  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      switch (i) {
        case 0 -> System.out.println("i равно нулю.");
        case 1 -> System.out.println("i равно единице.");
        case 2 -> System.out.println("i равно двум.");
        case 3 -> System.out.println("i равно трем.");
        default -> System.out.println("i больше трех.");
      }
    }

  }
}
