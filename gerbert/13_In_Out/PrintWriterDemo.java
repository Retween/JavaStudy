import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

  public static void main(String[] args) {
    PrintWriter pr = new PrintWriter(System.out, true);
    String str = "Dfdf";
    int i = 3;
    double d = 4.5e-3;

    pr.println(str);
    pr.println(i);
    pr.println(d);
  }

}
