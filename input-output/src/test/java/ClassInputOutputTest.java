import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ClassInputOutputTest {

  @Test
  void inputFirstName() {
    String actual = "First Name";
    InputStream inputStream = new ByteArrayInputStream(actual.getBytes());
    System.setIn(inputStream);
    String expected = ClassInputOutput.inputFirstName();

    assertEquals(actual, expected);
  }

  @Test
  void inputLastName() {
    String actual = "Last Name";
    InputStream inputStream = new ByteArrayInputStream(actual.getBytes());
    System.setIn(inputStream);
    String expected = ClassInputOutput.inputLastName();

    assertEquals(actual, expected);
  }

  @Test
  void printMap() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Map<Character, Integer> map = new HashMap<>();
    map.put('ф', 1);
    map.put('а', 1);
    map.put('м', 1);
    map.put('и', 2);
    map.put('л', 1);
    map.put('я', 1);

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }

    String actual = outContent.toString();
    outContent.reset();

    ClassInputOutput.printMap(map);
    String expend = outContent.toString();

    assertEquals(actual, expend);
  }

  @Test
  void printString() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    String actual = "actual";
    ClassInputOutput.printString("actual");
    assertEquals(actual, outContent.toString());
  }
}