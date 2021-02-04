import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {

  String str();

  int val();

}

public class Meta {

  //аннотировать метод
  @MyAnno1(str = "Пример аннотации", val = 100)
  public static void myMeth() {
    Meta ob = new Meta();

//    11 получить аннотацию из метода
//    11 и вывести значения ее членов
    try {
//      11 сначала получить объект типа Class,
      //          11 представляющий данный класс
      Class<?> c = ob.getClass();

      //      затем получить объект типа Method,
      //          11 представляющий данный метод
      Method m = c.getMethod("myMeth");

      //      11 далее получить аннотацию для данного класса
      MyAnno1 anno = m.getAnnotation(MyAnno1.class);

      //и наконец, вывести значения членов аннотации
      System.out.println(anno.str() + " " + anno.val());
    } catch (NoSuchMethodException e) {
      System.out.println("Метод не найден");
    }
  }

  public static void main(String[] args) {
    myMeth();
  }

}
