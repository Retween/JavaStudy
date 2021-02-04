public class FinallyDemo {

  static void procA() {
//    11 сгенерировать исключение в методе
    try {
      System.out.println("В теле метода procA()");
      throw new RuntimeException("демонстрация");
    } finally {
      System.out.println("Блок оператора finally в методе procA()");
    }
  }

  //возвратить управление из блока оператора try
  static void procB() {
    try {
      System.out.println("В теле метода procB()");
      return;
    } finally {
      System.out.println("Блок оператора finally в методе procB()");
    }
  }

  //выполнить try как обычно
  static void procC() {
    try {
      System.out.println("В теле метода procC()");
    } finally {
      System.out.println("Блок оператора finally в методе procC()");
    }
  }

  public static void main(String[] args) {
    try {
      procA();
    } catch (Exception e) {
      System.out.println("Исключение перехвачено " + e);
    }

    procB();
    procC();
  }

}
