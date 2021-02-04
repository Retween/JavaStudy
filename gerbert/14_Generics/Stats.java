public class Stats<T extends Number> {

  T[] nums;

  Stats(T[] o) {
    nums = o;
  }

  double average() {
    double sum = 0.0;
    for (T num : nums) {
      sum += num.doubleValue();
    }
    return sum / nums.length;
  }

  boolean sameAvg(Stats<?> ob) {
    return average() == ob.average();
  }
}

class BoundsDemo {

  public static void main(String[] args) {
    Integer[] inums = {1, 2, 3, 4, 5};
    Stats<Integer> iOb = new Stats<>(inums);
    double v = iOb.average();
    System.out.println("v = " + v);

    Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
    Stats<Double> dOb = new Stats<>(dnums);
    double w = dOb.average();
    System.out.println("w = " + w);

    Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
    Stats<Float> fOb = new Stats<>(fnums);
    double x = fOb.average();
    System.out.println("x = " + x);

    System.out.println(iOb.sameAvg(dOb));
    System.out.println(iOb.sameAvg(fOb));


  }
}
