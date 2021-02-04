public class AnotherClient implements Callback {

  public void callback(int n) {
    System.out.println("Еще один вариант метода callback");
    System.out.println("p в квадрате равно " + (n * n));
  }
}
