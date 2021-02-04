//Применение цикла for в стиле for each для
//обращения к двухмерному массиву
public class ForEach3 {

  public static void main(String[] args) {
    int sum = 0;
    int[][] nums = new int[3][5];

    // присвоить значение элементам массива nums
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        nums[i][j] = (i + 1) * (j + 1);
      }
    }
    // использовать цикл for в стиле for each для
    // вывода и суммирования значений
    for (int[] i : nums) {
      for (int j : i) {
        System.out.println("Значение равно " + j);
        sum+=j;
      }
    }
    System.out.println("sum = " + sum);
  }
}
