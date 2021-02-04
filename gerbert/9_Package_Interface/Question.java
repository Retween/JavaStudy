import java.util.Random;

interface SharedConstants {

  int NO = 0;
  int YES = 1;
  int MAYBE = 2;
  int LATER = 3;
  int SOON = 4;
  int NEVER = 5;
}

public class Question implements SharedConstants {

  Random rand = new Random();

  int ask() {
    int prob = (int) (100 * rand.nextDouble());
    if (prob < 30) {
      return NO;
    } else if (prob < 60) {
      return YES;
    } else if (prob < 75) {
      return LATER;
    } else if (prob < 98) {
      return SOON;
    } else {
      return NEVER;
    }
  }
}

class AskMe implements SharedConstants {

  static void answer(int result) {
    switch (result) {
      case NO -> System.out.println("Нет");
      case YES -> System.out.println("Да");
      case MAYBE -> System.out.println("Возможно");
      case LATER -> System.out.println("Позднее");
      case SOON -> System.out.println("Вскоре");
      case NEVER -> System.out.println("Никогда");
    }
  }

  public static void main(String[] args) {
    Question q = new Question();

    answer(q.ask());
    answer(q.ask());
    answer(q.ask());
    answer(q.ask());
  }

}
