
//В этом классе объявляется объект типа Вох
class BoxDemo {

  public static void main(String[] args) {

    Box mybox = new Box();
    Box mybox1 = new Box();
    double vol;

    //присвоить значение переменным экземпляра mybox
    mybox.width = 10;
    mybox.height = 20;
    mybox.depth = 15;

    mybox1.width = 3;
    mybox1.height = 6;
    mybox1.depth = 9;

    //рассчитать объем параллелепипеда
    vol = mybox.depth * mybox.height * mybox.width;
    System.out.println("Объем равен " + vol);

    vol = mybox1.depth * mybox1.height * mybox1.width;
    System.out.println("Объем равен " + vol);

  }

  /* Программа, использующая класс Вох
    Присвоить исходному файлу имя BoxDemo.java
    */
}