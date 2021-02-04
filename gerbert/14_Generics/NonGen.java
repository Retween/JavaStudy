class NonGen {

  Object ob;

  NonGen(Object o) {
    ob = o;
  }

  Object getOb() {
    return ob;
  }

  void showType() {
    System.out.println(ob.getClass().getName());
  }
}

class NonGenDemo {

  public static void main(String[] args) {
    NonGen iOb = new NonGen(88);
    iOb.showType();
    int v = (Integer) iOb.getOb();
    System.out.println("v = " + v);

    System.out.println();

    NonGen strOb = new NonGen("dfl kj");
    strOb.showType();
    String str = (String) strOb.getOb();
    System.out.println("str = " + str);

    iOb = strOb;
    v = (Integer) iOb.getOb();
  }

}