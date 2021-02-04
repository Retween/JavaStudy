//11 Объекты допускается передавать методам
//    11 в качестве параметров
class Test {

  int a, b;

  Test(int i, int j) {
    a = i;
    b = j;
  }

  //  возвратить логическое значение true, если в
//11 качестве параметра о указан вызывающий объект
  boolean equalTo(Test o) {
    return o.a == this.a && o.b == this.b;
  }

}

public class PassOb {

  public static void main(String[] args) {

    Test ob1 = new Test(100, 22);
    Test ob2 = new Test(100, 22);
    Test ob3 = new Test(-1, -1);

    System.out.println("ob1 == ob2 " + ob1.equalTo(ob2));
    System.out.println("ob1 == ob3 " + ob1.equalTo(ob3));

  }
}
