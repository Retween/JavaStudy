package SuspendResume;

class NewThread implements Runnable {


  String name;    //имя потока исполнения
  Thread t;
  boolean suspendFlag;

  public static NewThread createAndStart(String msg) {
    NewThread myThrd = new NewThread(msg);
    myThrd.t.start();
    return myThrd;
  }

  NewThread(String threadname) {
    name = threadname;
    t = new Thread(this, name);
    System.out.println("Новый поток: " + t);
    suspendFlag = false;
    t.start();
  }

  //Точка входа в поток исполнения
  public void run() {
    try {
      for (int i = 15; i > 0; i--) {
        System.out.println(name + ":" + i);
        Thread.sleep(200);
        synchronized (this) {
          while (suspendFlag) {
            wait();
          }
        }
      }
    } catch (InterruptedException e) {
      System.out.println(name + "Прерван");
    }
    System.out.println(name + " Завершен");
  }

  synchronized void mysuspend() {
    suspendFlag = true;
  }

  synchronized void myresume() {
    suspendFlag = false;
    notify();
  }


}

public class SuspendResume {


  public static void main(String[] args) {
    NewThread ob1 = new NewThread("Один");
    NewThread ob2 = new NewThread("Два");

    try {
      Thread.sleep(1000);
      ob1.mysuspend();
      System.out.println("Приостановка потока один");
      Thread.sleep(1000);
      ob1.myresume();
      System.out.println("Возобновление потока один");

      ob2.mysuspend();
      System.out.println("Приостановка потока два");
      Thread.sleep(1000);
      ob2.myresume();
      System.out.println("Возобновление потока два");
    } catch (InterruptedException e) {
      System.out.println("Главный поток прерван");
    }

    try {
      System.out.println("Ожидание завершения потоков");
      ob1.t.join();
      ob2.t.join();
    } catch (InterruptedException e) {
      System.out.println("Главный поток прерван");
    }
    System.out.println("Главный поток завершен");
  }
}
