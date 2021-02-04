public class RefDemo {

  public static void main(String[] args) {
    BoxWeight2 weightBox = new BoxWeight2(3, 5, 7, 8.37);
    BoxOverload2 plainBox = new BoxOverload2();
    double vol;

    vol = weightBox.volume();
    System.out.println("weightBox vol = " + vol);
    System.out.println("weightBox weight = " + weightBox.weight);
    System.out.println();

    // присвоить переменной ссылки на объект типа BoxWeight
    // ссылку на объект типа Вох
    plainBox = weightBox;
    vol = plainBox.volume();//!Верно, так как метод volume() определен в классе Вох
    System.out.println("plainBox vol = " + vol);
    /* Следующий оператор ошибочен, поскольку член plainBox не определяет член weight. */
//    System.out.println("plainBox weight = " + plainBox.weight);
  }
}
