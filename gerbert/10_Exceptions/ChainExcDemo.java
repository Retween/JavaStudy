//Цепочки исключений
public class ChainExcDemo {

  static void demoproc() {//
    //создать исключение
    NullPointerException e = new NullPointerException("Верхний уровень");

    //добавить причину исключения
    e.initCause(new ArithmeticException("причина"));

    throw e;
  }

  public static void main(String[] args) {
    try {
      demoproc();
    } catch (NullPointerException e) {
//      11 вывести исключение верхнего уровня
      System.out.println("Перехвачено исключение" + e);
      //11 вывести исключение, послужившее причиной
      // для исключения верхнего уровня
      System.out.println("Первопричина" + e.getCause());
    }
  }
}

