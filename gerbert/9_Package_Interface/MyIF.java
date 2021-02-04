public interface MyIF {

  int getNumber();

  //  11 А это объявление метода с реализацией по умолчанию.
//      11 Обратите внимание на его реализацию по умолчанию
  default String getString() {
    return "Объект типа String по умолчанию";
  }

  static int getDefaultNumber() {
    return 0;
  }
}

class MyIFImp implements MyIF {

  //В этом классе должен быть реализован только
//метод getNumЬer(), определенный в интерфейсе MyIF
  public int getNumber() {
    return 100;
  }

  //  11 Это объявление статического метода в интерфейсе
}


class MyIFImp2 implements MyIF {

  //В этом классе должен быть реализован только
//метод getNumЬer(), определенный в интерфейсе MyIF
  public int getNumber() {
    return 100;
  }

  public String getString() {
    return "Эта другая символьная строка";
  }
}

class DefaultMethodDemo {

  public static void main(String[] args) {
    MyIFImp obj = new MyIFImp();

    //Метод getNumЬer() можно вызвать, так как он
    //явно реализован в классе MyIFimp:
    System.out.println(obj.getNumber());

    //Метод getString() также можно вызвать,
    //так как в интерфейсе имеется его реализация
    //!по умолчанию:
    System.out.println(obj.getString());

    System.out.println(MyIF.getDefaultNumber());
  }
}
