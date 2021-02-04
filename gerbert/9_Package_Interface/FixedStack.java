interface IntStack {

  void push(int item);

  int pop();

  default void clear() {
    System.out.println("Метод clear не реализован");
  }

  //Очередная версия интерфейса IntStack с закрытым
  //методом, применяемым в двух реализуемых по
  //умолчанию методах

  //Метод с реализацией по умолчанию, возвращающий
  //массив из n элементов, начиная с вершины стека
  default int[] popNElements(int n) {
    return getElements(n);
  }

  //Метод с реализацией по умолчанию, возвращающий
  // из стека массив из n элементов, следующих после
  //указанного количества пропускаемых элементов
  default int[] skipAndPopNElements(int skip, int n) {
    //пропустить указанное количество элементов в стеке
    getElements(skip);
    // возвратить запрашиваемые элементы из стека
    return getElements(n);
  }

  // Закрытый метод, возвращающий массив из n элементов,
  //начиная с вершины стека
  private int[] getElements(int n) {
    int[] elements = new int[n];
    for (int i = 0; i < n; i++) {
      elements[i] = pop();
    }
    return elements;
  }
}

public class FixedStack implements IntStack {

  private int[] stck;
  private int tos;

  FixedStack(int size) {
    stck = new int[size];
    tos = -1;
  }

  public void push(int item) {
    if (tos == stck.length - 1) {
      System.out.println("Стек заполнен");
    } else {
      stck[++tos] = item;
    }
  }

  public int pop() {
    if (tos < 0) {
      System.out.println("Стек не загружен");
      return 0;
    } else {
      return stck[tos--];
    }
  }
}

class IFTest {

  public static void main(String[] args) {
    FixedStack mystack1 = new FixedStack(5);
    FixedStack mystack2 = new FixedStack(8);

    for (int i = 0; i < 5; i++) {
      mystack1.push(i);
    }
    for (int i = 0; i < 8; i++) {
      mystack2.push(i);
    }

    System.out.println("Стек в mystack1 ");
    for (int i = 0; i < 5; i++) {
      System.out.println(mystack1.pop());
    }
    System.out.println("Стек в mystack2 ");
    for (int i = 0; i < 8; i++) {
      System.out.println(mystack2.pop());
    }
  }
}
