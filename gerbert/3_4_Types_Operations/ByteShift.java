public class ByteShift {

  public static void main(String[] args) {
    byte a = 64, b;
    int i;
    final int x = 5;
    var y = 4.54;
//    x = 8; \u000a System.out.println("laaaaaaaggggg a: " + a);
    i = a << 2;
    b = (byte) (a << 2);

    System.out.println("Первоначальное значение a: " + a);
    System.out.println("i and b: " + i + " " + b + y + x);
  }

}
