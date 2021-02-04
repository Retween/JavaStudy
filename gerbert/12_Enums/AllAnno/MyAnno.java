package AllAnno;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

  String str() default "Тестирование";

  int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {

  String description();
}


@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {

  @What(description = "Аннотация тестового метода")
  @MyAnno(str = "Testing", val = 100)
  public static void myMeth() {
    Meta2 ob = new Meta2();

    try {
      Annotation[] annos = ob.getClass().getAnnotations();

      //вывести все аннотации для класса Meta2
      System.out.println("Все аннотации для класса Meta2");
      for (Annotation a : annos) {
        System.out.println(a);
      }
      System.out.println();

      //вывести все аннотации для метода myMeth()
      Method m = ob.getClass().getMethod("myMeth");
      annos = m.getAnnotations();
      System.out.println("Все аннотации метода myMeth");
      for (Annotation a : annos) {
        System.out.println(a);
      }
    } catch (NoSuchMethodException e) {
      System.out.println("dfdfl");
    }
  }

  public static void main(String[] args) {
    myMeth();
  }
}
