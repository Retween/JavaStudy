public class SuperSubCatch {

  public static void main(String[] args) {
    try {
      int a = 0;
      int b = 42 / a;
    } catch (Exception e) {
      System.out.println("Перехват исключений из общего класса Exception: " + e);
    }
    /*Этот оператор catch вообще не будет достигнут,
    так как подкласс ArithmeticException является
    производным от класса Exception. */
//    catch (ArithmeticException e) {   нужно поменять местами с суперклассомкетчом
//      System.out.println("Этот код недостижим");
//    }
  }

}
