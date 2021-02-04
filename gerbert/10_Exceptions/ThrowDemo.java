public class ThrowDemo {

  static void domoproc() {
    try {
      throw new NullPointerException("Демонстрация");
    } catch (NullPointerException e) {
      System.out.println("Исключение перехвачено в теле метода demoproc()");
      System.out.println(e);
      throw e;  //повторно сгенерировать исключение
    }
  }

  public static void main(String[] args) {
    try {
      domoproc();
    } catch (NullPointerException e) {
      System.out.println("Повторный перехват: " + e);
    }
  }

}
