import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Rulet {

  public static int findMinCut(int N) {
    int result;
    ArrayList<Integer> data = new ArrayList<>();

    if (N % 2 != 0) {
      N = N + 1;
    }
    for (int i = 1; i <= N; i++) {
      if (0 == (N % i)) {
        data.add(i);
      }
    }

    if (data.size() % 2 == 0) {
      result = data.get(data.size() / 2 - 1) - 1 + data.get(data.size() / 2) - 1;
    } else {
      result = 2 * (data.get(data.size() / 2) - 1);
    }

    return result;
  }

  public static void main(String[] args) throws IOException {
    int N, result;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      N = Integer.parseInt(br.readLine());
    }

    result = findMinCut(N);
    System.out.println(result);

  }
}
