//Усовершенствованный класс Stack, в котором
//используется свойство длины массива
class Stack2 {

  private int[] stck;
  private int tos;

  //  инициализировать вершину стека
  Stack2(int size) {
    stck = new int[size];
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

class TestStack3 {

  public static void main(String[] args) {

    Stack2 mystack1 = new Stack2(5);
    Stack2 mystack2 = new Stack2(8);

    for (int i = 0; i < 5; i++) {
      mystack1.push(i);
    }
    for (int i = 0; i < 8; i++) {
      mystack2.push(i);
    }

    System.out.println("mystack1 ");
    for (int i = 0; i < 5; i++) {
      System.out.println(mystack1.pop());
    }
    System.out.println("mystack2 ");
    for (int i = 0; i < 8; i++) {
      System.out.println(mystack2.pop());
    }

  }
}
