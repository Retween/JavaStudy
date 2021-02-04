import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mobile {

  public static void main(String[] args) throws IOException {
    int A, B, C, D;
    int result;
    String[] input;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      input = br.readLine().split(" ");
    }
    A = Integer.parseInt(input[0]);
    B = Integer.parseInt(input[1]);
    C = Integer.parseInt(input[2]);
    D = Integer.parseInt(input[3]);

    if (D > B) {
      result = A + C * (D - B);
    } else {
      result = A;
    }

    System.out.println(result);
  }

}
