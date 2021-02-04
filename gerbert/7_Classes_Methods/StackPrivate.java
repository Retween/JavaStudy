public class StackPrivate {

  private final int[] stck = new int[10];
  private int tos;

  //  инициализировать вершину стека
  StackPrivate() {
    tos = -1;
  }

  //  разместить элемент в стеке
  void push(int item) {
    if (tos == 9) {
      System.out.println("Стек заполнен");
    } else {
      stck[++tos] = item;
    }
  }

  int pop() {
    if (tos < 0) {
      System.out.println("Стек не загружен");
      return 0;
    } else {
      return stck[tos--];
    }
  }

}

class TestStack2 {

  public static void main(String[] args) {
    StackPrivate mystack1 = new StackPrivate();
    StackPrivate mystack2 = new StackPrivate();

    for (int i = 0; i < 10; i++) {
      mystack1.push(i);
    }
    for (int i = 10; i < 20; i++) {
      mystack2.push(i);
    }

    System.out.println("Стек в mystack1");
    for (int i = 0; i < 10; i++) {
      System.out.println(mystack1.pop());
    }

    System.out.println("Стек в mystack2");
    for (int i = 0; i < 10; i++) {
      System.out.println(mystack2.pop());
    }

//    mystack1.tos
//    mystack2.stck[3] =103;
  }
}



