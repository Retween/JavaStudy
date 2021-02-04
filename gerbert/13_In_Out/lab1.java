import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Telephone {

  String number;
  String name;

  public Telephone(String number, String name) {
    this.number = number;
    this.name = name;
  }

  public String getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }
}

public class lab1 {

  public static void main(String[] args) throws Exception {
    ArrayList<Telephone> book = new ArrayList<>();
    String regex = "[0-9]+";
    String str, nf = "";

    try (BufferedReader br = new BufferedReader(
        new FileReader(new File("C:\\Users\\erne_\\Documents\\Java\\gerbert\\13_In_Out\\1.txt")))
    ) {
      for (int i = 0; i < 10; i++) {
        str = br.readLine();
        String name = str.replaceAll("[^A-z]", "");
        String number = str.replaceAll("[^0-9]", "");
        book.add(new Telephone(number, name));
      }
    } catch (IOException e) {
      System.out.println("Ошибка чтения файла");
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (!(str = br.readLine()).equals("stop")) {
      if (str.matches(regex)) {
        for (Telephone a : book) {
          if (a.getNumber().equals(str)) {
            System.out.println(a.getName());
            nf = "";
            break;
          } else {
            nf = "не найдено\n";
          }
        }
        System.out.println(nf);
      } else {
        for (Telephone a : book) {
          if (a.getName().equals(str)) {
            System.out.println(a.getNumber());
            nf = "";
            break;
          } else {
            nf = "не найдено\n";
          }
        }
        System.out.println(nf);
      }
    }
    System.out.println("Программа завершена");
  }
}

