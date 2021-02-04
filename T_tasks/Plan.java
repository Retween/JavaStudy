import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Plan {

  public static void main(String[] args) throws IOException {
    double X, Y;
    ArrayList<Double> planCoor = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String[] input = br.readLine().split(" ");
      X = Double.parseDouble(input[0]);
      Y = Double.parseDouble(input[1]);

      input = br.readLine().split(" ");
      for (String x : input) {
        planCoor.add(Double.parseDouble(x));
      }
    }

    HashMap<Double, Double> original = new HashMap<>();
    HashMap<Double, Double> plan = new HashMap<>();
    for (double i = 0, j = 0; i < X; i += 0.1, j += 0.1) {
      original.put(i, j);
    }
    System.out.println(planCoor);
    for (double i = planCoor.get(0); i < planCoor.get(2); i += 1) {
      for (double j = planCoor.get(1); j < planCoor.get(5); j += 1) {
        plan.put(i, j);
      }
    }
    System.out.println(original);
    System.out.println(plan);
  }

}
