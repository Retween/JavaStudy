//В этом классе определяется целочисленный стек, где
//     можно хранить до 10 целочисленных значений
class Stack {

  int[] stck = new int[10];
  int tos;

  //  инициализировать вершину стека
  Stack() {
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

  //  извлечь элемент из стека
  int pop() {
    if (tos < 0) {
      System.out.println("Стек не загружен");
      return 0;
    } else {
      return stck[tos--];
    }
  }
}

class TestStack {

  public static void main(String[] args) {

    Stack mystack1 = new Stack();
    Stack mystack2 = new Stack();

    for (int i = 0; i < 10; i++) {
      mystack1.push(i);
    }
    for (int i = 10; i < 20; i++) {
      mystack2.push(i);
    }

    System.out.println("Содержимое стека 1 ");
    for (int i = 0; i < 10; i++) {
      System.out.println(mystack1.pop());
    }
    System.out.println("Содержимое стека 2 ");
    for (int i = 0; i < 10; i++) {
      System.out.println(mystack2.pop());
    }


  }
}
