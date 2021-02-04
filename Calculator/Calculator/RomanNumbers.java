package Calculator;

import java.util.TreeMap;

public enum RomanNumbers {
  I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7),
  VIII(8), IX(9), X(10);

  private final static TreeMap<Integer, String> map = new TreeMap<>();

  static {
    map.put(100, "C");
    map.put(90, "XC");
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");
  }

  private final int value;

  RomanNumbers(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public static String convertToRoman(int value) {
    int key = map.floorKey(value);
    if (value == key) {
      return map.get(value);
    }
    return map.get(key) + convertToRoman(value - key);
  }
}

