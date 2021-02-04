import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

class Word {

  String name;
  int num;

  public Word(String name) {
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

public class lab2 {

  public static void main(String[] args) throws Exception {
    ArrayList<Word> dict = new ArrayList<>();
    String in;
    StringBuilder text = new StringBuilder();
    StringBuilder word = new StringBuilder();
    HashMap<String, Integer> wordToCount = new HashMap<>();

    try (
        BufferedReader br = new BufferedReader(
            new FileReader(
                new File("C:\\Users\\erne_\\Documents\\Java\\gerbert\\13_In_Out\\2in.txt")));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("C:\\Users\\erne_\\Documents\\Java\\gerbert\\13_In_Out\\2out.txt"))
    ) {
      while ((in = br.readLine()) != null) {
        text.append(in);
      }
    }
    char[] chText = text.toString().toCharArray();

    for (char x : chText) {
      if (x <= 'я' && x >= 'A') {
        word.append(x);
      } else {
        if (!word.toString().equals("") && word.length() > 3) {
          Word elem = (new Word(word.toString().toLowerCase()));
          dict.add(elem);
          word = new StringBuilder();
        } else {
          word = new StringBuilder();
        }
      }
    }

//    for (Word x : dict) {
//      if (!wordToCount.containsKey(x)) {
//        wordToCount.put(x, 0);
//      }
//    }

  }
}

