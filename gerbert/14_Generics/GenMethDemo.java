public class GenMethDemo {

  static <T extends Comparable<T>, V extends T>
  boolean isIn(T x, V[] y) {
    for (V v : y) {
      if (x.equals(v)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Integer[] nums = {1, 2, 3, 4, 5};
    System.out.println(isIn(2, nums));
    System.out.println(isIn(7, nums));

    String[] str = {
        "один", "два", "три", "четыре", "пять"
    };
    System.out.println(isIn("один", str));
    System.out.println(isIn("семь", str));

  }

}
