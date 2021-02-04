import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

class Words {

  String name;
  int num;

  public Words(String name) {
    this.name = name;
    num = 1;
  }

  public String getName() {
    return name;
  }

  public int getNum() {
    return num;
  }

  public void setNum() {
    num++;
  }
}

public class lab22 {

  public static void main(String[] args) throws Exception {
    String in, text = "", word = "";
    ArrayList<String> dict = new ArrayList<>();
    HashMap<String, Integer> wordToCount = new HashMap<>();

    try (
        BufferedReader br = new BufferedReader(
            new FileReader(
                new File("C:\\Users\\erne_\\Documents\\Java\\gerbert\\13_In_Out\\2in.txt")));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("C:\\Users\\erne_\\Documents\\Java\\gerbert\\13_In_Out\\2out.txt"))
    ) {
      while ((in = br.readLine()) != null) {
        text += in;
      }

      char[] chText = text.toString().toCharArray();
      for (char x : chText) {
        if (x <= 'я' && x >= 'A') {
          word += (x);
        } else {
          if (!word.toString().equals("") && word.length() > 3 && word.length() < 20) {
            dict.add(word.toLowerCase());
            word = "";
          } else {
            word = "";
          }
        }
      }

      for (String x : dict) {
        if (!wordToCount.containsKey(x)) {
          wordToCount.put(x, 0);
        }
        wordToCount.put(x, wordToCount.get(x) + 1);
      }

      for (String x : wordToCount.keySet()) {
        bw.write(wordToCount.get(x) + " " + x);
        bw.write("\n");
      }
      System.out.println(wordToCount.size());

    }
  }
}
