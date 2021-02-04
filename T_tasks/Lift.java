import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Lift {

  public static int findMinStairs(int t, int l, ArrayList<Integer> floors) {
    int count = 0;
    if (t > floors.get(l - 1) - floors.get(0)) {
      for (int i = 1; i < floors.size(); i++) {
        count += floors.get(i) - floors.get(i - 1);
      }
    } else {
      count += floors.get(l - 1) - floors.get(0);
      floors.remove(l - 1);
      for (int i = 1; i < floors.size(); i++) {
        count += floors.get(i) - floors.get(i - 1);
      }
    }
    return count;
  }

  public static void main(String[] args) throws IOException {
    int n, t, l, result;
    ArrayList<Integer> floors = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String str = br.readLine();
      n = Integer.parseInt(str.split(" ")[0]);
      t = Integer.parseInt(str.split(" ")[1]);

      String[] arr = br.readLine().split(" ");
      for (String x : arr) {
        floors.add(Integer.parseInt(x));
      }

      str = br.readLine();
      l = Integer.parseInt(str);
    }

    result = findMinStairs(t, l, floors);
    System.out.println(result);
  }

}
