//В этой программе используется синхронизированный блок
class Callme2 {

  void call(String msg) {
    System.out.print("[" + msg);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("Прервано");
    }
    System.out.println("]");
  }
}

class Caller2 implements Runnable {

  String msg;
  final Callme2 target;
  Thread t;

  public Caller2(Callme2 targ, String s) {
    target = targ;
    msg = s;
    t = new Thread(this);
    t.start();
  }

  //синхронизированные вызовы метода call()
  public void run() {
    synchronized (target) {
//      синхронизированный блок
      target.call(msg);
    }
  }
}

public class Synch1 {

  public static void main(String[] args) {
    Callme2 target = new Callme2();
    try {
      Caller2 ob1 = new Caller2(target, "Добро пожаловать");
      ob1.t.join();
      Caller2 ob2 = new Caller2(target, "в синхронизированный");
      ob2.t.join();
      Caller2 ob3 = new Caller2(target, "мир!");
      ob3.t.join();
    } catch (InterruptedException e) {
      System.out.println("Прервано");
    }
  }
}
