package Repeated;

//Продемонстрировать применение повторяющейся аннотации

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//сделать аннотацию MyAnno повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {

  String str() default "Тестирование";

  int val() default 9000;

}

//Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {

  MyAnno[] value();
}

class RepeatAnno {

  //повторить аннотацию MyAnno в методе myMeth()
  @MyAnno(str = "Первая аннотация", val = -1)
  @MyAnno(str = "Вторая аннотация", val = 100)

  public static void myMeth(String str, int i) {
    RepeatAnno ob = new RepeatAnno();

    try {
      Class<?> c = ob.getClass();

      //получить аннотации для метода myMeth()
      Method m = c.getMethod("myMeth", String.class, int.class);

      //вывести повторяющиеся аннотации MyAnno
      Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
      System.out.println(anno);
    } catch (NoSuchMethodException e) {
      System.out.println("Метод не найден");
    }
  }

  public static void main(String[] args) {
    myMeth("Test", 10);
  }

}
