import java.util.Map;
import java.util.Scanner;

public class ClassInputOutput {

  public static String inputFirstName() {
    System.out.println("Введите имя");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public static String inputLastName() {
    System.out.println("Введите фамилию");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public static void printMap(Map<Character, Integer> map) {
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }
  }

  public static void printString(String s) {
    System.out.print(s);
  }

}
