public class ThisConstructor {

  int a, b;

  ThisConstructor(int i, int j) {
    a = i;
    b = j;
  }

  ThisConstructor(int i) {
    this(i, i);
  }

  ThisConstructor() {
    this(0);
  }

}
