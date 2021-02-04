import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FoodCourt {

  public static void main(String[] args) throws IOException {
    int n, count = 0;
    ArrayList<Integer> prices = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      n = Integer.parseInt(br.readLine());

      for (int i = 0; i < n; i++) {
        prices.add(Integer.parseInt(br.readLine()));
      }
    }

    while (prices.size() > 0) {
      count += prices.get(0);
      if (prices.get(0) >= 100) {
        prices.remove(0);
        prices.remove(Collections.max(prices));
      } else {
        prices.remove(0);
      }
    }

    System.out.println(count);
  }

}
